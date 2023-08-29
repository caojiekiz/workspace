package com.map_;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        //添加对象
        hashMap.put(1, new Emp("jack", 300000, 1));
        hashMap.put(2, new Emp("tom", 2000, 2));
        hashMap.put(3, new Emp("milan", 210000, 3));
        //遍历1
        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            Emp emp = (Emp)hashMap.get(key);
            if(emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }
        //遍历2
        Set entrySet = hashMap.entrySet();
        System.out.println("====迭代器====");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Emp emp = (Emp) entry.getValue();
            if(emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }
    }
}
class Emp {
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}