/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.annotation.config;

import com.proc.spring.annotation.bean.AutowireBean;
import com.proc.spring.annotation.bean.ConfigServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: 方建辉
 * @Date: 2020/6/11 10:50
 * @Description:
 */
/*@Configurable*/
@ComponentScan("com.proc.spring.annotation.bean")
public class AnnotationConfig {

    @Autowired
    private AutowireBean autowireBean;

    //就算不打@Configurable注解，扫描到@Bean注解之后还是会将当前类当成一个配置类处理
    @Bean
    public ConfigServiceBean getConfigService(){
        ConfigServiceBean configServiceBean = new ConfigServiceBean();

        configServiceBean.setAutowireBean(autowireBean);
        return configServiceBean;
    }
}
