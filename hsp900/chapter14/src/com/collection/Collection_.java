package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        list.remove(0);
        list.remove(true);
        System.out.println("list = " + list);
        System.out.println(list.contains("jack"));
        //list.clear();
        ArrayList arrayList = new ArrayList();
        arrayList.add("blue");
        arrayList.add("green");
        arrayList.add("red");
        arrayList.add("yellow");
        list.addAll(arrayList);
        System.out.println("list = " + list);
        System.out.println();
    }
}
