package com.qqclient.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;
import com.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UserClientService {
    private User u = new User();
    private Socket socket;
    public boolean checkUser(String userId, String pwd) {
        boolean b = false;
        u.setUserId(userId);
        u.setPasswd(pwd);
        //连接到服务端,发送U对象
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);//发送U对象
            //读取从服务器回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message) ois.readObject();
            if(ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {

                ClientConnectServerThread clientConnectServerThread =
                        new ClientConnectServerThread(socket);
                clientConnectServerThread.start();
                ManageClientConnectServerThread.addClientConnectServerThread(userId,clientConnectServerThread);
                b = true;
            } else {
                //如果登录失败

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return b;
    }
    public void onlineFriendList() {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(u.getUserId());
        try {
            ClientConnectServerThread clientConnectServerThread =
                    ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId());
            Socket socket = clientConnectServerThread.getSocket();

            ObjectOutputStream oos =
                    new ObjectOutputStream(socket .getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //编写方法,退出客户端,并给服务端发送一个退出系统的message对象
    public void logout() {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUserId());
        try {
            //ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectOutputStream oos =
                new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId()).getSocket().getOutputStream());
            oos.writeObject(message);
            System.out.println(u.getUserId() + " 退出系统");
            System.exit(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
