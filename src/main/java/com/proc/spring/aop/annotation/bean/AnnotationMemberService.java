package com.proc.spring.aop.annotation.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Auther: 方建辉
 * @Date: 2020/8/24 01:05
 * @Description:
 */
@Aspect
@Component
public class AnnotationMemberService {

    @Pointcut("execution(* com.proc.spring.aop.annotation.bean..*(..))")
    public void pointcutConfig(){
        System.out.println("======pointcutConfig=======");
    }

    @Before("pointcutConfig()")
    public void before(){
        System.out.println("======before=======");
    }
}
