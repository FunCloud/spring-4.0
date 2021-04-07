/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.transaction.bean;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description:
 * @Auther: 方建辉
 * @Date: 2021/4/7 09:07
 */
@Component
@Transactional
public class TransactionBeanC implements ITransactionC {

    @Transactional
    @Override
    public void doMethodC() {

    }
}
