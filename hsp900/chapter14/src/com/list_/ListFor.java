package com.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list = " + list);
        //迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
        System.out.println("====增强for====");
        //2.增强for
        for(Object o : list) {
            System.out.println("o = " + o);
        }
        //3 for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println("对象= " + list.get(i));
        }
    }
}
