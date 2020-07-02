/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.annotation.bean;

/**
 * @Auther: 方建辉
 * @Date: 2020/7/2 21:54
 * @Description:
 */
public class AnnoDecorateBean {

    public AnnoDecorateBean(String beanName){
        System.out.println("init " + beanName + " bean!");
    }
}
