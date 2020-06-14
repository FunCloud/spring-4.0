package com.proc.spring.aop;

import com.proc.spring.aop.aspect.AspectService;
import com.proc.spring.aop.bean.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fangjianhui on 2020/6/15.
 */
public class AopUnit {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:aop/spring-aop.xml");
        MemberService memberService = (MemberService) applicationContext.getBean("memberService");
        memberService.deleteMember();
    }
}
