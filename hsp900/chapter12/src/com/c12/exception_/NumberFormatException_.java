package com.c12.exception_;

public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "hspjy";
        //将string 转成int
        int num = Integer.parseInt(name);
        System.out.println(num);
    }
}
