package com.homework0342.hw04;

public class Manger extends Employee{
    private double bonus;
    //创建manger的时候奖金是多少 并不是确定的,在构造器中不给bonus
    //通过set方法设定bonus

    public Manger(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("经理 " + getName() +"的工资是 "+ (bonus + getDaySal()*getWorkDays()*getGrade()));
    }
}
