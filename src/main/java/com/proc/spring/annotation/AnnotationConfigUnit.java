/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.annotation;

import com.proc.spring.annotation.bean.AutowireBean;
import com.proc.spring.annotation.bean.ConfigServiceBean;
import com.proc.spring.annotation.config.AnnotationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: 方建辉
 * @Date: 2020/6/11 09:07
 * @Description:
 */
public class AnnotationConfigUnit {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        ConfigServiceBean bean = context.getBean(ConfigServiceBean.class);
        bean.call();

        AutowireBean autowireBean = context.getBean(AutowireBean.class);
        autowireBean.auto();
    }
}
