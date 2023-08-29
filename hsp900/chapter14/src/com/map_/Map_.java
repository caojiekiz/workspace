package com.map_;

import java.util.HashMap;

public class Map_ {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        //无序
        hashMap.put("no1","星期一");
        hashMap.put("no2","星期二");
        hashMap.put("no2","星期三");
        hashMap.put("no4","星期四");
        System.out.println("map= " + hashMap);
    }
}
