package com.homework0342.hw04;

public class Homework04 {
    public static void main(String[] args) {
        Manger manger = new Manger("liubei", 100, 20, 1.2);
        //设置奖金
        manger.setBonus(3000);
        manger.printSal();
        Worker worker = new Worker("wangxiaoming", 50, 20, 1);
        worker.printSal();
    }
}
