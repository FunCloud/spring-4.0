package com.proc.spring.transaction.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fangjianhui on 2020/6/17.
 */
@Component
@Transactional(readOnly = false)
public class TransactionBeanA {

    @Autowired
    private TransactionBeanB transactionBeanB;

    public void doDepBMethod(){
        transactionBeanB.doDepBMethod();
    }
}
