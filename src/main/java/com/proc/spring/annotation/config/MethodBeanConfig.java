package com.proc.spring.annotation.config;

import com.proc.spring.annotation.bean.AnnoMethodBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: 方建辉
 * @Date: 2022/5/15 23:17
 * @Description:
 */
@Configuration
public class MethodBeanConfig {

    @Bean
    public AnnoMethodBean doMethodBean(){
        return new AnnoMethodBean();
    }
}
