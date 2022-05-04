package com.proc.spring.annotation.config;

import com.proc.spring.annotation.custom.MyAnnotation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @Auther: 方建辉
 * @Date: 2022/5/4 21:32
 * @Description:
 */
//ComponentScan注解中的includeFilters属性，配合useDefaultFilters = false一起使用
@ComponentScan(value = "com.proc.spring.annotation.bean",
        useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = MyAnnotation.class)})
public class IncludeConfig {
}
