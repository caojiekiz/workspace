package com.homework;

import java.util.*;

public class Homework03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack", 1000);
        map.put("tom", 1200);
        map.put("smith", 2900);
        System.out.println(map);

        map.put("jack", 2600);
        System.out.println(map);
        Set keySet = map.keySet();
        for(Object key : keySet) {
            map.put(key,(Integer) map.get(key) + 100);
        }
        System.out.println(map);
        //遍历 entrySet
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        Collection values = map.values();
        for (Object value : values) {
            System.out.println("工资= " + values);
        }
    }
}
