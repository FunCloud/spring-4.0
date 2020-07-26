package com.proc.spring.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: 方建辉
 * @Date: 2020/7/26 17:27
 * @Description:
 */
public class DateUtils {

    public static Date parseDate(String dateStr, String formatStr) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatStr);
        return dateFormat.parse(dateStr);
    }
}
