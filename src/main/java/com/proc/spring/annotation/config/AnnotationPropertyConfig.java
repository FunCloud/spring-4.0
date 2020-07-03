/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.annotation.config;

import com.proc.spring.annotation.bean.AnnoDecorateBean;
import com.proc.spring.annotation.bean.AutowireBean;
import com.proc.spring.annotation.bean.IConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @Auther: 方建辉
 * @Date: 2020/7/2 20:39
 * @Description:
 */
@ComponentScan("com.proc.spring.annotation.bean")
@PropertySource("classpath:annotation/spring-anno.properties")
public class AnnotationPropertyConfig {

    @Value("com.proc.spring.annotation.bean.AnnoPropertyBean")
    private String beanName;

    @Autowired
    private Environment env;

    @Inject
    @Named("customConfigBean")
    private IConfig config;

    @Bean
    public AnnoDecorateBean getDecorateBean(){
        System.out.println(env.getProperty("com.proc.spring.annotation.bean.AnnoPropertyBean"));
        System.out.println(config);
        return new AnnoDecorateBean(beanName);
    }
}
