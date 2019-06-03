/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core;

import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.api.hint.HintManager;
import org.apache.shardingsphere.core.constant.DatabaseType;
import org.apache.shardingsphere.core.constant.properties.ShardingProperties;
import org.apache.shardingsphere.core.constant.properties.ShardingPropertiesConstant;
import org.apache.shardingsphere.core.metadata.ShardingMetaData;
import org.apache.shardingsphere.core.rewrite.SQLBuilder;
import org.apache.shardingsphere.core.rewrite.SQLRewriteEngine;
import org.apache.shardingsphere.core.route.RouteUnit;
import org.apache.shardingsphere.core.route.SQLLogger;
import org.apache.shardingsphere.core.route.SQLRouteResult;
import org.apache.shardingsphere.core.route.SQLUnit;
import org.apache.shardingsphere.core.route.type.TableUnit;
import org.apache.shardingsphere.core.rule.ShardingRule;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Base sharding engine.
 *
 * @author zhangliang
 */
@RequiredArgsConstructor
public abstract class BaseShardingEngine {
    
    private final ShardingRule shardingRule;
    
    private final ShardingProperties shardingProperties;
    
    private final ShardingMetaData metaData;
    
    private final DatabaseType databaseType;
    
    /**
     * Shard.
     *
     * @param sql SQL
     * @param parameters parameters of SQL
     * @return SQL route result
     */
    public SQLRouteResult shard(final String sql, final List<Object> parameters) {
        List<Object> clonedParameters = cloneParameters(parameters);
        // 执行路由操作(其中隐含了SQL解析过程)
        SQLRouteResult result = route(sql, clonedParameters);
        /**
         * 这里分两种情况讨论:
         * 1. 如果仅仅基于库做了分片,则原来的SQL不需要改写,直接发送给路由之后的实际数据源执行即可
         * 2. 如果基于表做了分片,则需要将原来的SQL改写(实际的表名已经发生了变化),然后再发送给路由的数据源执行
         * 这里添加的对象RouteUnit其抽象维度为数据源+SQL.
         */
        result.getRouteUnits().addAll(HintManager.isDatabaseShardingOnly() ? convert(sql, clonedParameters, result) : rewriteAndConvert(sql, clonedParameters, result));
        if (shardingProperties.getValue(ShardingPropertiesConstant.SQL_SHOW)) {
            boolean showSimple = shardingProperties.getValue(ShardingPropertiesConstant.SQL_SIMPLE);
            SQLLogger.logSQL(sql, showSimple, result.getSqlStatement(), result.getRouteUnits());
        }
        return result;
    }
    
    protected abstract List<Object> cloneParameters(List<Object> parameters);
    
    protected abstract SQLRouteResult route(String sql, List<Object> parameters);
    
    private Collection<RouteUnit> convert(final String sql, final List<Object> parameters, final SQLRouteResult sqlRouteResult) {
        Collection<RouteUnit> result = new LinkedHashSet<>();
        for (TableUnit each : sqlRouteResult.getRoutingResult().getTableUnits().getTableUnits()) {
            result.add(new RouteUnit(each.getDataSourceName(), new SQLUnit(sql, parameters)));
        }
        return result;
    }

    /**
     * SQL重写
     * @param sql
     * @param parameters
     * @param sqlRouteResult
     * @return
     */
    private Collection<RouteUnit> rewriteAndConvert(final String sql, final List<Object> parameters, final SQLRouteResult sqlRouteResult) {
        SQLRewriteEngine rewriteEngine = new SQLRewriteEngine(shardingRule, sql, databaseType, sqlRouteResult, parameters, sqlRouteResult.getOptimizeResult());
        // 执行改写过程，并将执行中间结果保持至sqlBuilder中，需要执行替换的部分已占位符的形式保持
        SQLBuilder sqlBuilder = rewriteEngine.rewrite(sqlRouteResult.getRoutingResult().isSingleRouting());
        Collection<RouteUnit> result = new LinkedHashSet<>();
        for (TableUnit each : sqlRouteResult.getRoutingResult().getTableUnits().getTableUnits()) {
            // 执行上面待替换部分，并真正需要执行的SQL语句
            result.add(new RouteUnit(each.getDataSourceName(), rewriteEngine.generateSQL(each, sqlBuilder, metaData.getDataSource())));
        }
        return result;
    }
}
