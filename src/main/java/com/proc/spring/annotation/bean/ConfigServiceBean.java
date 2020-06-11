/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.annotation.bean;

import lombok.Data;

/**
 * @Auther: 方建辉
 * @Date: 2020/6/11 10:51
 * @Description:
 */
@Data
public class ConfigServiceBean {

    private AutowireBean autowireBean;

    public void call(){
        System.out.println("config success");
        System.out.println(autowireBean);
    }
}
