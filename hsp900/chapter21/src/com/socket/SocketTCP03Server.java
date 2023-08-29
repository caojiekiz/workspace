package com.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings("ALL")
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端,在9999端口监听,等待连接..");
        Socket socket = serverSocket.accept();
        System.out.println("服务端socket = " + socket.getClass());
        InputStream inputStream = socket.getInputStream();
//        byte[] buf = new byte[1024];
//        int readLen = 0;
//        while ((readLen = inputStream.read(buf)) != -1) {
//            System.out.println(new String(buf,0,readLen));
//        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        //获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
//        outputStream.write("hello,client".getBytes());
//        socket.shutdownOutput();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello client zifuliu");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        //关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
