package com.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        //
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("tom");
        System.out.println("list = " + list);
        //索引从0开始
        System.out.println(list.get(3));
        //在index 1的位置插入一个对象
        list.add(1,"apple");
        System.out.println("list = " + list);
        List list2 = new ArrayList();
        list2.add("1");
        list2.add("2");
        list.addAll(1,list2);
        System.out.println("list2 = " + list2);
        System.out.println("list = " + list);

    }
}
