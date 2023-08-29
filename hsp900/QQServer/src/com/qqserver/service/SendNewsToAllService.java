package com.qqserver.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;
import com.utils.Utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class SendNewsToAllService implements Runnable{
    private Scanner scanner= new Scanner(System.in);

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入服务器要推送的新闻/消息");
            String news = Utility.readString(100);
            if("exit".equals(news)) {
                break;
            }
            Message message = new Message();
            message.setSender("服务器");
            message.setMesType(MessageType.MESSAGE_TO_ALL_MES);
            message.setContent(news);
            message.setSendTime(new Date().toString());
            System.out.println("服务器推送消息给所有人说: " + news);
            HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();
            Iterator<String> iterator = hm.keySet().iterator();
            while (iterator.hasNext()) {
                String onLineUserId = iterator.next().toString();
                try {
                    ServerConnectClientThread serverConnectClientThread = hm.get(onLineUserId);
                    ObjectOutputStream oos = new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());
                    oos.writeObject(message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
