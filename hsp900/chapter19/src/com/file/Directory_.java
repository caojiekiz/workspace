package com.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }
    @Test
    public void m1() {
        String filePath = "/Users/dreamtank/kiz/111.rtf";
        File file = new File(filePath);
        if (file.exists()) {
            if(file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("该文件不存在...");
        }
    }
    @Test
    public void m2() {
        String filePath = "/Users/dreamtank/kiz1";
        File file = new File(filePath);
        if (file.exists()) {
            if(file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("该文件不存在...");
        }
    }
    @Test
    public void m3() {
        String directoryPath = "/Users/dreamtank/kiz1";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath + "存在...");
        } else {
            if(file.mkdir()) {
                System.out.println(directoryPath + "创建成功...");
            } else {
                System.out.println("创建失败...");
            }
        }
    }

}
