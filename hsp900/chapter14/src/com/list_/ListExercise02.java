package com.list_;
import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国演义","罗贯中",20.2));
        list.add(new Book("小李飞刀","古龙",9.4));
        list.add(new Book("红楼梦续","曹雪芹",39.4));
        for(Object o : list) {
            System.out.println(o);
        }
        sort(list);
        System.out.println("====排序后====");
        for(Object o : list) {
            System.out.println(o);
        }
    }
    public static void sort(List list) {
        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if(book1.getPrice() > book2.getPrice()) {//交换
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }

}
