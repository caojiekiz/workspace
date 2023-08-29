package com.writer_;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "/Users/dreamtank/kiz/note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write('H');
            fileWriter.write(chars);
            fileWriter.write("todayislong".toCharArray(),0,3);
            fileWriter.write("你好北京!!");
            fileWriter.write("上海天津",0,2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("程序结束");
    }
}
