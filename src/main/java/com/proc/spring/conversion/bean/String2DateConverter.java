package com.proc.spring.conversion.bean;

import com.proc.spring.util.DateUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;

/**
 * @Auther: 方建辉
 * @Date: 2020/7/26 17:24
 * @Description:
 */
public class String2DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        try {
            return DateUtils.parseDate(source, "yyyy-MM-dd HH:mm:ss");
        } catch (ParseException e) {
            return null;
        }
    }
}
