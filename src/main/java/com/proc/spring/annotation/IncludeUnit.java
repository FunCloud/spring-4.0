package com.proc.spring.annotation;

import com.proc.spring.annotation.bean.IConfig;
import com.proc.spring.annotation.config.IncludeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: 方建辉
 * @Date: 2022/5/4 21:21
 * @Description:
 */
public class IncludeUnit {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IncludeConfig.class);
        IConfig bean = applicationContext.getBean(IConfig.class);
    }
}
