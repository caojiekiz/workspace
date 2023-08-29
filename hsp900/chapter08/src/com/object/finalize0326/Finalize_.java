package com.object.finalize0326;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        bmw = null;
        System.gc();
        System.out.println("程序退出了...");
    }
}
class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

//新版Jdk已删除此方法


//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
}
