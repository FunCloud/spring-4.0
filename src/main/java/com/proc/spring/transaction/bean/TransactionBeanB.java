package com.proc.spring.transaction.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fangjianhui on 2020/6/17.
 */
@Component
@Transactional(readOnly = false)
public class TransactionBeanB implements ITransactionB {

    @Autowired
    private ITransactionA transactionBeanA;

    public void doDepMethod(){
        System.out.println("进入B类方法...");
        int a = 1/0;
        //transactionBeanA.doDepBMethod();
    }
}
