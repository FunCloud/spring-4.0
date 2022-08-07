package com.proc.spring.aop.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Auther: 方建辉
 * @Date: 2022/8/7 23:47
 * @Description:
 */
@Configuration
@ComponentScan("com.proc.spring.aop.annotation.bean")
@EnableAspectJAutoProxy
public class Aop2Config {
}
