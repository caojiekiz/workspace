package com.api_;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        InetAddress host = InetAddress.getByName("www.google.co.jp");
        System.out.println(host);
    }
}
