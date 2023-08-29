package com.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        //客户端连接服务器
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //穿件读取磁盘文件的输入流
        String filePath = "/Users/dreamtank/kiz/123.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        socket.shutdownOutput();
        //接收从服务端回复的消息
        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);
        //关闭流
        inputStream.close();
        bos.close();
        socket.close();
    }
}
