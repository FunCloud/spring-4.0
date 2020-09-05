package com.proc.spring.aop.xml;

import com.proc.spring.aop.xml.bean.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fangjianhui on 2020/6/15.
 */
public class AopUnit {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:aop/spring-aop.xml");
        MemberService memberService = applicationContext.getBean(MemberService.class);
        memberService.updateMember();
    }
}
