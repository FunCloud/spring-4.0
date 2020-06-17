package com.proc.spring.transaction;

import com.proc.spring.transaction.bean.TransactionBeanA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by fangjianhui on 2020/6/17.
 */
public class TransactionUnit {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:transaction/spring-transaction.xml");
        TransactionBeanA bean = applicationContext.getBean(TransactionBeanA.class);
        bean.doDepBMethod();
    }
}
