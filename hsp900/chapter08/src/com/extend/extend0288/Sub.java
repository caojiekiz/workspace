package com.extend.extend0288;

public class Sub extends Base {
    public Sub() {
        System.out.println("子类无参数构造器被调用sub()...");
    }
    public Sub(String name) {
        System.out.println("子类带参数(String name)构造器被调用sub()...");
    }
    public Sub(String name, int age) {
        System.out.println("子类带参数(String name, int age)构造器被调用sub()...");
    }
    public void sayOk() {
        System.out.println(n1 + " " + n2 + " " + n3 + " ");
        System.out.println("n4= " + getN4());

    }
}
