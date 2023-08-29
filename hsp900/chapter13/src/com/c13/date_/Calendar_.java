package com.c13.date_;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println("年: " + calendar.get(Calendar.YEAR));
        System.out.println("月: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("日: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时: " + calendar.get(Calendar.HOUR));//12小时制
        System.out.println("分钟: " + calendar.get(Calendar.MINUTE));
        System.out.println("秒: " + calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" +
                calendar.get(Calendar.DAY_OF_MONTH) + " " + calendar.get(Calendar.HOUR) + ":" +
                calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
    }
}
