/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.annotation;

import com.proc.spring.annotation.bean.ConfigServiceBean;
import com.proc.spring.annotation.config.AnnotationConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: 方建辉
 * @Date: 2020/7/3 11:06
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RunWithAnnotationUnit.class)
public class RunWithAnnotationUnit {

    @Test
    public void runContext(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        ConfigServiceBean bean = context.getBean(ConfigServiceBean.class);
        bean.call();
    }
}
