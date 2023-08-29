package com.c13.arrays_;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1,20,80,90,222};
        int index = Arrays.binarySearch(arr,81);
        System.out.println("index=" + index);
        Integer[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println("==拷贝执行完毕后==");
        System.out.println(Arrays.toString(newArr));
        System.out.println("==num数组填充==");
        //数组元素填充:替换原数组数据
        Integer[] num = new Integer[]{9,3,2};
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));
        //equals
        Integer[] arr2 = {1,20,80,90,2223};
        boolean equals = Arrays.equals(arr, arr2);
        System.out.println("equals = " + equals);
        //asList
        List asList = Arrays.asList(2,3,4,5,6,1);
        System.out.println("aslist = " + asList);
    }
}
