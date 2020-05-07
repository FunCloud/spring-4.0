package com.proc.spring.ioc;

import com.proc.spring.bean.QRFirstBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by fangjianhui on 2020/5/7.
 */
public class FileSystemUnit {

    public static void main(String[] args) {
        ApplicationContext application = new FileSystemXmlApplicationContext("classpath:filesystem/spring-context.xml");
        QRFirstBean firstBean = (QRFirstBean) application.getBean("firstBean");
        firstBean.call();
    }
}
