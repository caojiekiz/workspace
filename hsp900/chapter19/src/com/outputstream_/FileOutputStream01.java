package com.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.*;

public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void wirteFile() {
        String filePath = "/Users/dreamtank/hello.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath);
            String str = "hello,world!";
            fileOutputStream.write(str.getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
