package com.map_;

import java.util.*;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","星期一");
        map.put("no2","星期二");
        map.put("no2","星期三");
        map.put(null,"星期三");
        map.put("no2",null);
        map.put("no4","星期四");
        System.out.println("map= " + map);
        map.remove(null);
        System.out.println("map=" + map);
        Object val = map.get("星期三");
        System.out.println("val =" + val);
        System.out.println("k-v =" + map.size());
        System.out.println(map.isEmpty());
        //map.clear();
        System.out.println(map.containsKey("no4 "));
        //
        Set keySet = map.keySet();
        //增强for
        System.out.println("第一 种方式");
        for(Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        //迭代器
        System.out.println("第二种方式");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + map.get(key));
        }
        //把所有的values取出
        Collection values = map.values();
        System.out.println("===取出所有的value===");
        for(Object value  : values) {
            System.out.println(value);
        }
        //迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println(value);
        }
        //
        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry =  iterator2.next();
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());

        }
    }
}
class Book {
    private String name;
    private int num;

}