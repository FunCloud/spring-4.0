package com.proc.spring.transaction;

import com.proc.spring.transaction.bean.ITransactionA;
import com.proc.spring.transaction.config.AnnotationTransactionConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by fangjianhui on 2020/6/17.
 */
public class AnnotationTransactionUnit {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationTransactionConfig.class);
        ITransactionA bean = applicationContext.getBean(ITransactionA.class);
        bean.doDepMethod();
    }
}
