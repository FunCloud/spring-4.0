package com.proc.spring.annotation;

import com.proc.spring.annotation.bean.IConfig;
import com.proc.spring.annotation.config.MethodBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: 方建辉
 * @Date: 2022/5/15 23:19
 * @Description:
 */
public class MethodBeanUnit {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MethodBeanConfig.class);
        IConfig bean = applicationContext.getBean(IConfig.class);
    }
}
