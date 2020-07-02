/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.annotation.config;

import com.proc.spring.annotation.bean.AnnoDecorateBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Auther: 方建辉
 * @Date: 2020/7/2 20:39
 * @Description:
 */
@PropertySource("classpath:annotation/spring-anno.properties")
public class AnnotationPropertyConfig {

    @Value("com.proc.spring.annotation.bean.AnnoPropertyBean")
    private String beanName;

    @Autowired
    private Environment env;

    @Bean
    public AnnoDecorateBean getDecorateBean(){
        System.out.println(env.getProperty("com.proc.spring.annotation.bean.AnnoPropertyBean"));
        return new AnnoDecorateBean(beanName);
    }
}
