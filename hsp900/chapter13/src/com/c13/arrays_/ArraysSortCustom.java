package com.c13.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1,-1,8,0,20};
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println("===定制后排序====");
        System.out.println(Arrays.toString(arr));
    }
    //使用冒泡排序
    public static void bubble01(int[] arr) {
        int temp = 0;
        for(int i = 0;i < arr.length;i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //结合冒泡+定制
    public static void bubble02(int[] arr, Comparator c) {
        int temp = 0;
        for(int i = 0;i < arr.length;i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
