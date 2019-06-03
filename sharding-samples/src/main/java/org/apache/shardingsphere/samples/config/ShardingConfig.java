package org.apache.shardingsphere.samples.config;

import com.google.common.collect.Lists;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.shardingsphere.api.config.masterslave.MasterSlaveRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.KeyGeneratorConfiguration;
import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.TableRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.InlineShardingStrategyConfiguration;
import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.*;

@Configuration
public class ShardingConfig {

    @ConfigurationProperties(prefix = "spring.shardingsphere.datasource.master-ds-0")
    @Bean
    public DataSource dataSourceMaster0() {
        return new HikariDataSource();
    }

    @ConfigurationProperties(prefix = "spring.shardingsphere.datasource.master-ds-1")
    @Bean
    public DataSource dataSourceMaster1() {
        return new HikariDataSource();
    }

    @ConfigurationProperties(prefix = "spring.shardingsphere.datasource.salve-ds-0")
    @Bean
    public DataSource dataSourceSlave0() {
        return new HikariDataSource();
    }

    @ConfigurationProperties(prefix = "spring.shardingsphere.datasource.salve-ds-1")
    @Bean
    public DataSource dataSourceSlave1() {
        return new HikariDataSource();
    }

    @Bean
    @Primary
    public DataSource dataSource() throws SQLException {
        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
        shardingRuleConfig.getTableRuleConfigs().add(getOrderTableRuleConfiguration());
        shardingRuleConfig.getTableRuleConfigs().add(getOrderItemTableRuleConfiguration());
        shardingRuleConfig.getTableRuleConfigs().add(getUserTableRuleConfiguration());
        shardingRuleConfig.setMasterSlaveRuleConfigs(getMasterSlaveRuleConfigurations());
        shardingRuleConfig.getBindingTableGroups().add("t_order, t_order_item");
        shardingRuleConfig.setBroadcastTables(Collections.singleton("core_category"));
        Properties properties = new Properties();
        properties.setProperty("sql.show", "true");
        return ShardingDataSourceFactory.createDataSource(createDataSourceMap(), shardingRuleConfig, properties);
    }

    /**
     * t_user分片规则
     */
    private TableRuleConfiguration getUserTableRuleConfiguration() {
        TableRuleConfiguration userTableRuleConfig =
                new TableRuleConfiguration("t_user", "ds-${0..1}.t_user");
        userTableRuleConfig.setDatabaseShardingStrategyConfig(
                new InlineShardingStrategyConfiguration("user_id", "ds-${user_id % 2}"));
        return userTableRuleConfig;
    }

    /**
     * t_order分片规则
     */
    private TableRuleConfiguration getOrderTableRuleConfiguration() {
        TableRuleConfiguration orderTableRuleConfig =
                new TableRuleConfiguration("t_order", "ds-${0..1}.t_order_${0..1}");
        orderTableRuleConfig.setDatabaseShardingStrategyConfig(
                new InlineShardingStrategyConfiguration("user_id", "ds-${user_id % 2}"));
        orderTableRuleConfig.setTableShardingStrategyConfig(
                new InlineShardingStrategyConfiguration("order_id", "t_order_${order_id % 2}"));
        orderTableRuleConfig.setKeyGeneratorConfig(new KeyGeneratorConfiguration("SNOWFLAKE", "order_id"));
        return orderTableRuleConfig;
    }

    /**
     * t_order_item分片规则
     * @return
     */
    private TableRuleConfiguration getOrderItemTableRuleConfiguration() {
        TableRuleConfiguration orderTableRuleConfig =
                new TableRuleConfiguration("t_order_item", "ds-${0..1}.t_order_item_${0..1}");
        orderTableRuleConfig.setDatabaseShardingStrategyConfig(
                new InlineShardingStrategyConfiguration("user_id", "ds-${user_id % 2}"));
        orderTableRuleConfig.setTableShardingStrategyConfig(
                new InlineShardingStrategyConfiguration("order_id", "t_order_item_${order_id % 2}"));
        orderTableRuleConfig.setKeyGeneratorConfig(new KeyGeneratorConfiguration("SNOWFLAKE", "order_item_id"));
        return orderTableRuleConfig;
    }

//    /**
//     * t_order_item分表规则
//     * @return
//     */
//    private TableRuleConfiguration getOrderItemTableRuleConfiguration() {
//        TableRuleConfiguration orderTableRuleConfig =
//                new TableRuleConfiguration("t_order_item");
//        orderTableRuleConfig.setDatabaseShardingStrategyConfig(new ComplexShardingStrategyConfiguration("user_id", new ComplexKeysShardingAlgorithm<Long>() {
//            @Override
//            public Collection<String> doSharding(Collection<String> availableTargetNames, ComplexKeysShardingValue<Long> shardingValue) {
//                Collection<String> selected = Lists.newArrayList();
//                for (String dataSourceName : availableTargetNames) {
//
//
////                    for (Map.Entry<String, Collection<Long>> entry : shardingValue.getColumnNameAndShardingValuesMap().entrySet()) {
////
////
////
////                    }
////
////                    String targetDataSource = "ds-" + new Long(shardingValue % 2).toString();
////
////
////                    if (StringUtils.equals(dataSourceName, targetDataSource)) {
////
////                    }
//                }
//                return selected;
//            }
//        }));
//        orderTableRuleConfig.setTableShardingStrategyConfig(
//                new InlineShardingStrategyConfiguration("order_id", "t_order_item_${order_id % 2}"));
//        orderTableRuleConfig.setKeyGeneratorConfig(new KeyGeneratorConfiguration("SNOWFLAKE", "order_item_id"));
//        return orderTableRuleConfig;
//    }

    private List<MasterSlaveRuleConfiguration> getMasterSlaveRuleConfigurations() {
        return Lists.newArrayList(
                new MasterSlaveRuleConfiguration("ds-0", "master-ds-0", Collections.singletonList("slave-ds-0")),
                new MasterSlaveRuleConfiguration("ds-1", "master-ds-1", Collections.singletonList("slave-ds-1")));
    }

    /**
     * 数据源
     */
    private Map<String, DataSource> createDataSourceMap() {
        Map<String, DataSource> dataSourceMap = new HashMap<>();
        dataSourceMap.put("master-ds-0", dataSourceMaster0());
        dataSourceMap.put("slave-ds-0", dataSourceSlave0());
        dataSourceMap.put("master-ds-1", dataSourceMaster1());
        dataSourceMap.put("slave-ds-1", dataSourceSlave1());
        return dataSourceMap;
    }
}
