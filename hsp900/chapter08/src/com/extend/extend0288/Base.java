package com.extend.extend0288;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public Base() {//无参数构造器
        System.out.println("父类构造器被调用Base()...");
    }
    public Base(String name, int age) {//有参数构造器
        System.out.println("父类(String name, int age)构造器被调用Base()...");
    }
    public Base(String name) {//有参数构造器
        System.out.println("父类(String name)构造器被调用Base()...");
    }
    public int getN4() {
        return n4;
    }
    public void test100() {
        System.out.println("test100");
    }
    protected void test200() {
        System.out.println("test200");
    }
    void test300() {
        System.out.println("test300");
    }
    private void test400() {
        System.out.println("test400");
    }

}
