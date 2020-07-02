/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.annotation;

import com.proc.spring.annotation.config.AnnotationPropertyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: 方建辉
 * @Date: 2020/7/2 20:39
 * @Description:
 */
public class AnnotationPropertyConfigUnit {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationPropertyConfig.class);

    }
}
