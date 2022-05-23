package com.proc.spring.annotation;

import com.proc.spring.annotation.bean.IConfig;
import com.proc.spring.annotation.config.MapConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: 方建辉
 * @Date: 2022/5/23 23:34
 * @Description:
 */
public class MapBeanUnit {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MapConfig.class);
        MapConfig bean = applicationContext.getBean(MapConfig.class);
        bean.printMapMsg();
    }
}
