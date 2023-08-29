package com.super0297;
public class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public A() {
    }
    public A(String name) {
    }
    public A(String name, int age) {
    }

    public void m1() {
        System.out.println("n1=" + n1 + "n2=" + n2 + "n3=" + n3 + "n4=" + n4);
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

