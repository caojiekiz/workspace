package com.object.equals0318;

public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("jack", 10, '男');
        System.out.println(person1.equals(person2));
    }
}
class Person {
    private String name;
    private int age;
    private char gender;

    public boolean equals(Object obj) {
        if(this == obj) {//判断是否为同一个对象
            return true;
        }
        //类型判断
        if(obj instanceof Person) {//是person才进行比较
            Person p = (Person)obj;//向下转型,因为需要得到obj的各个属性
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
