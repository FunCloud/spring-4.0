package com.proc.spring.annotation.config;

import com.google.common.collect.Maps;
import com.proc.spring.annotation.bean.IConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @Auther: 方建辉
 * @Date: 2022/5/23 23:35
 * @Description:
 */
@Configuration
@ComponentScan("com.proc.spring.annotation")
public class MapConfig {

    @Autowired
    private Map<String, IConfig> configMap = Maps.newConcurrentMap();

    public MapConfig(Map<String, IConfig> configMap) {
        this.configMap.clear();
        configMap.forEach(this.configMap::put);
    }

    public void printMapMsg(){
        configMap.keySet().forEach(key -> {
            System.out.println("bean key is:" + key + " and bean is " + configMap.get(key));
        });
    }
}
