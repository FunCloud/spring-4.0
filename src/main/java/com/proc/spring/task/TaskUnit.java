/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Auther: 方建辉
 * @Date: 2020/12/3 20:14
 * @Description:
 */
public class TaskUnit {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:task/spring-task.xml");
        while(true){
            Thread.sleep(2000L);
        }
    }
}
