package com.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01() {
        String filePath = "/Users/dreamtank/hello.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            while((readData = fileInputStream.read()) != -1) {
                System.out.println((char)readData);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            try {
                fileInputStream.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}
