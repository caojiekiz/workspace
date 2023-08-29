package com.kiz.homework;

public class Homework02 {
    public static void main(String[] args) {
        String content = "00.89";
        String regStr = "^[+-]?([1-9]\\d*|0)(\\.\\d+)?$";
        if(content.matches(regStr)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

    }
}
