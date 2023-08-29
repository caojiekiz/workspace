package com.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket= new Socket(InetAddress.getLocalHost(), 9999);
        // ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("客户端 socket返回 = " + socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        //输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server 字符流");
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
