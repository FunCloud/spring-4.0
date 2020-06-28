package com.proc.spring.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fangjianhui on 2020/6/26.
 */
public class ComponentScanUnit {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:scan/spring-scan.xml");
    }
}
