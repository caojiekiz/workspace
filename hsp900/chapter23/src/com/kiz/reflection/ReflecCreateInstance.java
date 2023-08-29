package com.kiz.reflection;

import java.lang.reflect.Constructor;

public class ReflecCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class<?> userClass = Class.forName("com.kiz.reflection.User");
        Object o = userClass.newInstance();
        System.out.println(o);
        Constructor<?> constructor = userClass.getConstructor(String.class);
        //constructor.newInstance()
    }
}
class User {
    private int age;
    private String name;
    public User() {
    }
    public User(String name) {
        this.name = name;
    }
    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}