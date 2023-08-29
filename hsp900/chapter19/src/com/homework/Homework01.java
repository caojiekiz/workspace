package com.homework;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Homework01 {
    public static void main(String[] args) throws IOException{
        String directoryPath = "/Users/dreamtank/mytemp";
        File file = new File(directoryPath);
        if(!file.exists()) {
            if(file.mkdirs()) {
                System.out.println("创建" + directoryPath + "创建成功");

            } else {
                System.out.println("创建" + directoryPath + "创建失败");
            }
        }
        String filePath = "/Users/dreamtank/mytemp/hello.txt";
        file = new File(filePath);
        if(!file.exists()) {
            //创建文件
            if(file.createNewFile()) {
                System.out.println(filePath + "创建成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello, world! by kiz");
                bufferedWriter.close();
            } else {
                System.out.println(filePath + "创建失败");
            }
        } else {
            //sout
            System.out.println(filePath + "已经存在,不在重复创建...");
        }
    }
}
