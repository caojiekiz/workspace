package com.qqclient.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 */
public class MessageClientService {
    /**
     *
     * @param content
     * @param senderId
     */
    public void sendMessageToAll(String content, String senderId) {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_TO_ALL_MES);
        message.setSender(senderId);
        //message.setGetter(getterId);
        message.setContent(content);
        message.setSendTime(new Date().toString());
        System.out.println(senderId + " 对大家说 " + content);
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
        }
    }
    /**
     *
     * @param content
     * @param senderId
     * @param getterId
     */
    public void sendMessageToOne(String content,String senderId, String getterId) {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_COMM_MES);
        message.setSender(senderId);
        message.setGetter(getterId);
        message.setContent(content);
        message.setSendTime(new Date().toString());
        System.out.println(senderId + " 对 " + getterId + " 说 " + content);
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {


        }
    }
}
