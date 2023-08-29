package com.file;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }
    @Test
    public void create01() {
        String filePath = "/Users/dreamtank/news.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功!");
        } catch (IOException e) {

            System.out.println("没有创建成功");
        }
    }
    //方式2
    @Test
    public void create02() {
        File parentFile = new File("/Users/dreamtank/kiz/");
        String fileName = "new2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void create03() {
        //File parentFile = new File("/Users/");
        String home = System.getProperty("/Users");
        File file = new File(home + File.separator + "dreamtank" + File.separator + "kiz" + File.separator + "Java.txt");
        System.out.println(home);
        String fileName = "new2.txt";
        //File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
