package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小黑", 3));
        list.add(new Dog("大黄", 5));
        list.add(new Dog("大壮", 8));
        //for 增强
        for(Object dog : list) {
            System.out.println("dog= " + dog);
        }
        //使用迭代器遍历
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println("dog=" + dog);
        }
    }
}
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}