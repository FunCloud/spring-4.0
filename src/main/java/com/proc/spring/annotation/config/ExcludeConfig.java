package com.proc.spring.annotation.config;

import com.proc.spring.annotation.custom.MyAnnotation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @Auther: 方建辉
 * @Date: 2022/5/4 22:06
 * @Description:
 */
// ComponentScan 注解中的 includeFilters 属性，配合 useDefaultFilters=false 一起使用
// excludeFilters 则不需要用到 useDefaultFilters=false 就能生效
@ComponentScan(value = "com.proc.spring.annotation.bean",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = MyAnnotation.class)})
public class ExcludeConfig {
}
