package com.proc.spring.conversion.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Auther: 方建辉
 * @Date: 2020/7/26 17:23
 * @Description:
 */
@Data
public class ConversionDateBean {

    private Date createDate;

    @Override
    public String toString() {
        return "ConversionDateBean{" +
                "createDate=" + createDate +
                '}';
    }
}
