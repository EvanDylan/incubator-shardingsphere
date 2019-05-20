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

package org.apache.shardingsphere.core.route.router.masterslave;

import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.api.hint.HintManager;
import org.apache.shardingsphere.core.constant.SQLType;
import org.apache.shardingsphere.core.route.SQLRouteResult;
import org.apache.shardingsphere.core.route.type.TableUnit;
import org.apache.shardingsphere.core.rule.MasterSlaveRule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Sharding with master-slave router interface.
 * 
 * @author zhangliang
 */
@RequiredArgsConstructor
public final class ShardingMasterSlaveRouter {
    
    private final Collection<MasterSlaveRule> masterSlaveRules;
    
    /**
     * Route Master slave after sharding.
     * 
     * @param sqlRouteResult SQL route result
     * @return route result
     */
    public SQLRouteResult route(final SQLRouteResult sqlRouteResult) {
        for (MasterSlaveRule each : masterSlaveRules) {
            route(each, sqlRouteResult);
        }
        return sqlRouteResult;
    }
    
    private void route(final MasterSlaveRule masterSlaveRule, final SQLRouteResult sqlRouteResult) {
        Collection<TableUnit> toBeRemoved = new LinkedList<>();
        Collection<TableUnit> toBeAdded = new LinkedList<>();
        for (TableUnit each : sqlRouteResult.getRoutingResult().getTableUnits().getTableUnits()) {
            // 判断是否为同一个逻辑数据源,不同则跳过
            if (!masterSlaveRule.getName().equalsIgnoreCase(each.getDataSourceName())) {
                continue;
            }
            // 移除当前each,因为当前each中保持的数据源还是逻辑库
            toBeRemoved.add(each);
            String actualDataSourceName;
            /**
             * 判断是否主库：
             * 1. 不是DQL(Data Query Language)
             * 2. 通过一个线程上次是否访问了主库(由ThreadLocal保持)
             * 3. 通过Hint方式直接指定访问主库
             */
            if (isMasterRoute(sqlRouteResult.getSqlStatement().getType())) {
                // 在ThreadLocal中设定标识,标记当前线程访问主库,那么后续当前线程的访问都会强制走主库
                MasterVisitedManager.setMasterVisited();
                // 获取逻辑数据源对应的主库真是数据源
                actualDataSourceName = masterSlaveRule.getMasterDataSourceName();
            } else {
                // 如果需要访问主库,通过轮训算法筛选一个从库数据源
                actualDataSourceName = masterSlaveRule.getLoadBalanceAlgorithm().getDataSource(
                        masterSlaveRule.getName(), masterSlaveRule.getMasterDataSourceName(), new ArrayList<>(masterSlaveRule.getSlaveDataSourceNames()));
            }
            // 创建包含真实的物理数据源
            toBeAdded.add(createNewTableUnit(actualDataSourceName, each));
        }
        sqlRouteResult.getRoutingResult().getTableUnits().getTableUnits().removeAll(toBeRemoved);
        sqlRouteResult.getRoutingResult().getTableUnits().getTableUnits().addAll(toBeAdded);
    }
    
    private boolean isMasterRoute(final SQLType sqlType) {
        return SQLType.DQL != sqlType || MasterVisitedManager.isMasterVisited() || HintManager.isMasterRouteOnly();
    }
    
    private TableUnit createNewTableUnit(final String actualDataSourceName, final TableUnit originalTableUnit) {
        TableUnit result = new TableUnit(actualDataSourceName, originalTableUnit.getDataSourceName());
        result.getRoutingTables().addAll(originalTableUnit.getRoutingTables());
        return result;
    }
}
