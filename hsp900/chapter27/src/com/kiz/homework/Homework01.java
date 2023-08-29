package com.kiz.homework;

public class Homework01 {
    public static void main(String[] args) {
        String content = "sky@shou.com";
        String regStr = "^[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";
        if(content.matches(regStr)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

    }
}
