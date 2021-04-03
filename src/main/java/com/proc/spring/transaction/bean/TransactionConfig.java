package com.proc.spring.transaction.bean;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Auther: 方建辉
 * @Date: 2021/3/24 23:53
 * @Description:
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:transaction/druid.properties")
public class TransactionConfig {

    @Value("${druid.driverClassName}")
    private String driverClassName;

    @Value("${druid.url}")
    private String url;

    @Value("${druid.username}")
    private String username;

    @Value("${druid.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        System.out.println("driverClassName====> " + driverClassName);
        System.out.println("url====> " + url);
        System.out.println("username====> " + username);
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

    @Bean
    public PlatformTransactionManager txManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
