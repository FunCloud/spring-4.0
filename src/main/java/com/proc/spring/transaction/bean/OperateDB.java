package com.proc.spring.transaction.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

/**
 * @Auther: 方建辉
 * @Date: 2022/1/10 0:41
 * @Description:
 */
@Service
public class OperateDB {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertDict1(){
        String id = new Date().getTime() + "00" + new Random().nextInt();
        String sql = "insert into SYSTEM_DICT values('"+id+"','1','1','1','1','1','1','1','2019-04-11 23:41:04','1','2019-04-11 23:41:04','1');";
        jdbcTemplate.execute(sql);
    }

    public void insertDict2(){
        String id = new Date().getTime() + "00" + new Random().nextInt();
        String sql = "insert into SYSTEM_DICT values('"+id+"','2','2','2','2','2','2','2','2019-04-11 23:41:04','1','2019-04-11 23:41:04','1');";
        jdbcTemplate.execute(sql);
    }
}
