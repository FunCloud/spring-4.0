package com.proc.spring.dependence;

import com.proc.spring.dependence.bean.CircleDepA;
import com.proc.spring.ioc.bean.QRFirstBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by fangjianhui on 2020/5/7.
 */
public class DependenceFileSystemUnit {

    public static void main(String[] args) {
        ApplicationContext application = new FileSystemXmlApplicationContext("classpath:dependence/spring-context.xml");
        CircleDepA circleDepA = (CircleDepA) application.getBean("circleDepA");
        circleDepA.doDepBMethod();
    }
}
