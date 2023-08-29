package com.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Homework01Client {
    public static void main(String[] args) throws IOException {
        Socket socket= new  Socket(InetAddress.getLocalHost(), 9999);

        OutputStream outputStream = socket.getOutputStream();
        //输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String question = scanner.next();

        bufferedWriter.write(question);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        //outputStream.write("hello,server".getBytes());
        //socket.shutdownOutput();
        //
        InputStream inputStream = socket.getInputStream();
//        byte[] buf = new byte[1024];
//        int readLen = 0;
//        while ((readLen = inputStream.read(buf)) != -1) {
//            System.out.println(new String(buf,0,readLen));
//        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        //socket.shutdownOutput();
        //关闭
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
