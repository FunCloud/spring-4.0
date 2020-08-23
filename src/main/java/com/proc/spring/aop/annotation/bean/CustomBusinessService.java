package com.proc.spring.aop.annotation.bean;

import org.springframework.stereotype.Component;

/**
 * @Auther: 方建辉
 * @Date: 2020/8/24 01:12
 * @Description:
 */
@Component
public class CustomBusinessService {

    public void doBusiness(){
        System.out.println("=====do business=========");
    }
}
