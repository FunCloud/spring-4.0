package com.proc.spring.aop.xml.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by fangjianhui on 2020/6/15.
 */
public class AspectService {

    public void before(JoinPoint pointcut){
        System.out.println("进入切面before方法...");
    }

    public void afterReturn(JoinPoint joinpoint){
        System.out.println("进入切面afterReturn方法...");
    }

    public void after(JoinPoint joinpoint){
        System.out.println("进入切面after方法...");
    }

    public void afterThrowing(JoinPoint joinpoint){
        System.out.println("进入切面afterThrowing方法...");
    }
}
