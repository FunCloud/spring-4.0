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
    @Autowired
    private ITransactionC transactionBeanC;

    @Transactional//TODO 不生效
    public void doDepMethod(){
        System.out.println("进入C类方法...");
        transactionBeanC.doMethodC();
        System.out.println("进入A类方法...");
        try {
            transactionBeanB.doDepMethod();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
