package com.proc.spring.transaction.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @Auther: 方建辉
 * @Date: 2022/8/21 18:45
 * @Description:
 */
/*@Configuration
@ComponentScan("com.proc.spring.transaction.bean")
@EnableAspectJAutoProxy*/
public class AnnotationTransactionConfig {

    @Value("${druid.driverClassName:com.mysql.jdbc.Driver}")
    private String driverClassName;

    @Value("${druid.url:jdbc:mysql://localhost:3306/jh?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull}")
    private String url;

    @Value("${druid.username:root}")
    private String username;

    @Value("${druid.password:root}")
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

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}
