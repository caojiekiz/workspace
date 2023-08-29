package com.c13.wrapper;

public class Integer01 {
    public static void main(String[] args) {
        //jdk5之前手动装箱和拆箱
        //手动装箱int→Integer
        int n1 = 100;
        //Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱
        int i = integer1.intValue();
        //jdk5后,可以自动装箱和自动拆箱
        int n2 = 200;
        Integer integer2 = n2;
        //自动拆箱
        int n3 = integer2;

    }
}
