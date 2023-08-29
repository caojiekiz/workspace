package com.c12.throws_;

import java.io.FileInputStream;

public class Throws01 {
    public static void main(String[] args) {

    }
    public void f2 () throws Exception {
        //创建一个文件流对象
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");
    }
}
