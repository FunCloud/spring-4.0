/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: 方建辉
 * @Date: 2020/7/14 20:04
 * @Description:
 */
public class ConfiguraBeanUnit {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:annotation/spring-configuration.xml");
    }
}
