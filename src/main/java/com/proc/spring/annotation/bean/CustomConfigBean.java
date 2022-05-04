/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.annotation.bean;

import com.proc.spring.annotation.custom.MyAnnotation;
import org.springframework.stereotype.Component;

/**
 * @Auther: 方建辉
 * @Date: 2020/7/3 10:39
 * @Description:
 */
@Component
@MyAnnotation
public class CustomConfigBean implements IConfig {
}
