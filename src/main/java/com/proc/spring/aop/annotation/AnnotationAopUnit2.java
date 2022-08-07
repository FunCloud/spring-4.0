package com.proc.spring.aop.annotation;

import com.proc.spring.aop.annotation.bean.CustomBusinessService;
import com.proc.spring.aop.annotation.config.Aop2Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: 方建辉
 * @Date: 2020/8/24 01:06
 * @Description:
 */
public class AnnotationAopUnit2 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Aop2Config.class);
        CustomBusinessService customBusinessService = (CustomBusinessService) applicationContext.getBean("customBusinessService");
        customBusinessService.doBusiness();
    }
}
