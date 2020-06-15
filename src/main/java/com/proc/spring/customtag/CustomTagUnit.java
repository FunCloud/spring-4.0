package com.proc.spring.customtag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fangjianhui on 2020/6/16.
 */
public class CustomTagUnit {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:custom-tag/spring-custom-tag.xml");
    }
}
