package com.method;

public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("wh");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }
        System.out.println(t.getName() + "线程的优先级 = " + t.getPriority());
        t.interrupt();
    }
}
class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子...." + i);
            }

            try {
                System.out.println(Thread.currentThread().getName() + "休眠中....");
                Thread.sleep(20000);
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + "被interrupt了");
            }

        }

    }
}