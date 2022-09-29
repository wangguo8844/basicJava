package main.rrays;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * dateFormat.parse dateFormate.format
 * Calender
 */

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将Date类按照规范转化成字符串格式
        String str = dateFormat.format(date);
        System.out.println(str);
        ///将Date类按照规范转化成对应日期类
        Date date1=dateFormat.parse("2010-10-10 20:20:20");
        System.out.println(date1);

        //获取当前系统时间
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        //设置指定时间
        instance.setTime(date1);
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.get(Calendar.DAY_OF_WEEK));
    }
}
