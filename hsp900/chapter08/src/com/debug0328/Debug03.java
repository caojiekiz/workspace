package com.debug0328;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {1, 32, 10, 5, 100};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
