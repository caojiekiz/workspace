package com.c13.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String format = dtf.format(ldt);
        System.out.println("格式化的日期= " + format);
        //日期加
        LocalDateTime localDateTime = ldt.plusDays(360);
        System.out.println("360天后=" + dtf.format(localDateTime));
        //
        LocalDateTime localDateTime2 = ldt.minusMinutes(3456);
        System.out.println("3456分钟前 日期=" + dtf.format(localDateTime2));

    }
}
