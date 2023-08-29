package com.encap0282;
//0282
public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackk");
        person.setAge(30);
        person.setSalary(3000);
        System.out.println(person.info());
        System.out.println(person.getSalary());
        Person smith = new Person("smith", 20  , 4000);
        System.out.println("smith's info");
        System.out.println(smith.info());
    }
}
class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("输入字符要在2-6个之间,默认wumingren");
            this.name = "wumingren";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //判断年龄在1-120之间
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你设置年龄不对,需要在(1-120),给默认年龄18");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info() {
        return "信息为:名字 " + name + " 年龄 " + age + " 薪水 " + salary;
    }


}