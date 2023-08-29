package com.c13.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1,20,90};
        System.out.println(Arrays.toString(integers));
        //sort
        Integer arr[] = {1,-1,7,0,89};
        Arrays.sort(arr);
        System.out.println("====默认排序====");
        System.out.println(Arrays.toString(arr));
        System.out.println("====定制排序====");
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
