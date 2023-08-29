package com.udp;

import java.io.IOException;
import java.net.*;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);
        byte[] data = "hello 明天吃火锅!".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.1.32"), 9999);
        socket.send(packet);
        //接收
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);

        socket.receive(packet);
        int length = packet.getLength();
        data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);
        //关闭
        socket.close();
        System.out.println("B端退出");
    }
}
