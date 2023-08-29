package com.c13.system_;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        int[] src = {1,2,3};
        int[] dest = new int[3];
        System.arraycopy(src,0,dest,0,3);
        System.out.println("dest = " + Arrays.toString(dest));

        System.out.println(System.currentTimeMillis());
    }
}
