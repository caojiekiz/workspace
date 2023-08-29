package com.homework0342.hw01;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Tom", 20, "writer");
        persons[1] = new Person("jack", 60, "php");
        persons[2] = new Person("mary", 50, "java");
        //输出当前对象数组
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        //使用冒泡排序
        Person tmp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                //if (persons[j].getAge() > persons[j + 1].getAge())从小到大
                if (persons[j].getAge() < persons[j + 1].getAge()) {//从大到小
                    tmp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = tmp;
                }
            }
            
        }
        System.out.println("排序后的效果");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}
class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
