package com.set_;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("Rose"));
        set.remove("john");
        System.out.println("set=" + set);
        //重置
        set = new HashSet();
        System.out.println("set=" + set);
        set.add("lucy");
        set.add("lucy");
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));
        System.out.println("set=" + set);
        //
        set.add(new String("kiz"));
        set.add(new String("kiz"));
        System.out.println("set=" + set);
    }
}
class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
