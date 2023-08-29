package com.writer_;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/dreamtank/kiz/note1.txt";
        //new FileWriter(filePath,true) 追加方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello beijing!");
        bufferedWriter.newLine();
        bufferedWriter.write("hello2 beijing!");
        bufferedWriter.newLine();
        bufferedWriter.write("hello3 beijing!");
        bufferedWriter.close();
    }
}
