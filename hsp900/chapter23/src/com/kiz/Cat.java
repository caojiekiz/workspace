package com.kiz;

public class Cat {
    private String name = "招财猫";
    public int age = 5;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public void hi() {
       // System.out.println("hi " + name);
    }
    public void cry() {
        System.out.println(name + "喵喵叫...");
    }
}
