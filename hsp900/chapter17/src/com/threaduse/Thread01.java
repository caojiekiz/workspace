package com.threaduse;

public class Thread01 {
    public static void main(String[] args) {
        //创建一个cat对象
        Cat cat = new Cat();
        cat.start();
        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for(int i = 0; i < 60; i++) {
            System.out.println("主线程i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Cat extends Thread {
    int times = 0;
    @Override
    public void run() {
        while(true) {
            System.out.println("MMMMMM" + (++times) + "线程名称 = " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(times == 80) {
                break;//当
            }
        }
    }
}