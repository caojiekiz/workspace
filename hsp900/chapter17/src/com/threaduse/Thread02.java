package com.threaduse;

public class Thread02 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        //dog.start() 没有start方法不能调用
//        Thread thread = new Thread(dog);
//        thread.start();
    }
}
class ThreadProxy implements Runnable {
    private Runnable target = null;
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();
    }
    public void start0() {
        run();
    }
}
class Dog implements Runnable {//通过实现runnable接口,开发线程
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫...hi" + (++count) + Thread.currentThread().getName());
        }
    }
}