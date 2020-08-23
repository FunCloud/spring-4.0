package com.proc.spring.aop.annotation;

import com.proc.spring.aop.annotation.bean.CustomBusinessService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: 方建辉
 * @Date: 2020/8/24 01:06
 * @Description:
 */
public class AnnotationAopUnit {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:aop/spring-anno-aop.xml");
        CustomBusinessService customBusinessService = (CustomBusinessService) applicationContext.getBean("customBusinessService");
        customBusinessService.doBusiness();
    }
}
