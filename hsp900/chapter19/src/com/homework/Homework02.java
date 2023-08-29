package com.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Homework02 {
    public static void main(String[] args) {
        String filePath = "/Users/dreamtank/mytemp/hello.txt";
        BufferedReader br = null;
        String line = "";
        int lineNum = 0;
        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {
                System.out.println(++lineNum + line);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

}
