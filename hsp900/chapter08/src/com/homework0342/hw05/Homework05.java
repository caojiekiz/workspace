package com.homework0342.hw05;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker("jack", 3000);
        worker.printSal();

        Peasant peasant = new Peasant("smith", 20000);
        peasant.printSal();

        Teacher teacher = new Teacher("sss", 2000);
        teacher.setClassDays(360);
        teacher.setClassSal(1000);
        teacher.printSal();
        Scientist scientist = new Scientist("zhongnanshan", 30000);
        scientist.setBonus(2000000);
        scientist.printSal();
    }

}
