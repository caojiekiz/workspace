package com.c13.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println("当前日期= " + d1);
        Date d2 = new Date(9234567);
        System.out.println(d1.getTime());
        System.out.println(d2);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("当前日期= " + format);
        String s = "1995年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println("parse=" + parse);
    }
}
