package com.qqserver.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;
import com.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class QQServer {
    private ServerSocket ss = null;
    private static HashMap<String, User> validUsers = new HashMap<>();
    static {
        validUsers.put("100", new User("100","123456"));
        validUsers.put("200", new User("200","123456"));
        validUsers.put("300", new User("300","123456"));
        validUsers.put("VIP1", new User("VIP1","123456"));
        validUsers.put("VIP2", new User("VIP2","123456"));
    }
    //验证用户是否合法的方法
    private boolean checkUser(String userId, String passwd) {
        User user = validUsers.get(userId);
        if(user == null) {
            return false;
        }
        if (!user.getPasswd().equals(passwd)) {
            return false;
        }
        return true;
    }
    public QQServer(){
        System.out.println("服务端在9999端口监听....");
        try {
            new Thread(new SendNewsToAllService()).start();
            ss = new ServerSocket(9999);
            while (true) {
                Socket socket = ss.accept();
                ObjectInputStream ois =
                        new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos =
                        new ObjectOutputStream(socket.getOutputStream());
                User u = (User) ois.readObject();
                Message message = new Message();
                if(checkUser(u.getUserId(), u.getPasswd())) {
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    oos.writeObject(message);
                    //创建一个线程
                    ServerConnectClientThread serverConnectClientThread =
                            new ServerConnectClientThread(socket, u.getUserId());
                    serverConnectClientThread.start();
                    ManageClientThreads.addClientThread(u.getUserId(),serverConnectClientThread);
                } else {
                    System.out.println("用户 id=" + u.getUserId() + " pwd =" + u.getPasswd() +"验证失败");
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    socket.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ss.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
