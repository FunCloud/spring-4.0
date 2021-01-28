/*
 * Copyright (c) 2020, QUANRONG TECHNOLOGY LTD. All rights reserved.
 */
package com.proc.spring.task.executor;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: 方建辉
 * @Date: 2020/12/3 20:19
 * @Description:
 */
@Slf4j
@Configuration
public class JobSpringExecutor {

    @Bean
    public XxlJobSpringExecutor xxlJobExecutor() {
        log.info("task job executor config init...");
        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses("http://193.112.44.94:8090/xxl-job-admin");
        xxlJobSpringExecutor.setAppname("proc-job");
        xxlJobSpringExecutor.setAddress("");
        xxlJobSpringExecutor.setIp("");
        xxlJobSpringExecutor.setPort(5000);
        xxlJobSpringExecutor.setAccessToken("");
        xxlJobSpringExecutor.setLogPath("/data/applogs/xxl-job/jobhandler");
        xxlJobSpringExecutor.setLogRetentionDays(3);
        return xxlJobSpringExecutor;
    }
}
