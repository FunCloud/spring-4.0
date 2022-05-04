package com.proc.spring.annotation;

import com.proc.spring.annotation.bean.IConfig;
import com.proc.spring.annotation.config.ExcludeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: 方建辉
 * @Date: 2022/5/4 22:07
 * @Description:
 */
public class ExcludeUnit {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExcludeConfig.class);
        IConfig bean = applicationContext.getBean(IConfig.class);
    }
}
