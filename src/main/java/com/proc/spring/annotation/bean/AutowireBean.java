/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.annotation.bean;

import org.springframework.stereotype.Component;

/**
 * @Auther: 方建辉
 * @Date: 2020/6/11 10:48
 * @Description:
 */
@Component
public class AutowireBean {

    public void auto(){
        System.out.println("autowire success");
    }
}
