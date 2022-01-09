package com.proc.spring.transaction.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fangjianhui on 2020/6/17.
 */
@Component
public class TransactionBeanA implements ITransactionA {

    @Autowired
    private ITransactionB transactionBeanB;

    public void doDepMethod(){
        System.out.println("进入A类方法...");
        try {
            transactionBeanB.doDepMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
