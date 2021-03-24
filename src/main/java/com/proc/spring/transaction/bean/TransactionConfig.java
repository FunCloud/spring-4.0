package com.proc.spring.transaction.bean;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @Auther: 方建辉
 * @Date: 2021/3/24 23:53
 * @Description:
 */
@Configuration
public class TransactionConfig {

    @Bean
    public DataSource dataSource() {
        // configure and return the necessary JDBC DataSource
        return new DruidDataSource();
    }

    @Bean("transactionManager")
    public PlatformTransactionManager txManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
