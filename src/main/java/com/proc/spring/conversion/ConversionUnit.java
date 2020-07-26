package com.proc.spring.conversion;

import com.proc.spring.conversion.bean.ConversionDateBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: 方建辉
 * @Date: 2020/7/26 17:22
 * @Description:
 */
public class ConversionUnit {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:conversion/spring-conversion.xml");
        ConversionDateBean bean = applicationContext.getBean(ConversionDateBean.class);
        System.out.println(bean);
    }
}
