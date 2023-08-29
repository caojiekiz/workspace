package com.homework0342.hw05;

public class Teacher extends Employee{
    private int classDays;
    private double classSal;

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    public int getClassDays() {
        return classDays;
    }

    public void setClassDays(int classDays) {
        this.classDays = classDays;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public void printSal() {
        System.out.println(getName() + " 年工资是:" + (getSal() * getSalMonth() + classDays*classSal));
    }
}
