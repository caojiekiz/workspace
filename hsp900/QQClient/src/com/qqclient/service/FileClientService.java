package com.qqclient.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;

import java.io.*;

public class FileClientService {
    public void sendFileToOne(String src, String dest, String sendId, String getterId) {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_FILE_MES);
        message.setSender(sendId);
        message.setGetter(getterId);
        message.setSrc(src);
        message.setDest(dest);
        //System.out.println("");
        FileInputStream fileInputStream = null;
        byte[] fileBytes = new byte[(int) new File(src).length()];
        try {
            fileInputStream = new FileInputStream(src);
            fileInputStream.read(fileBytes);
            //设置到message对象
            message.setFileBytes(fileBytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if(fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("\n" + sendId + " 给 " + getterId + " 发送文件: " + src
                + " 到对方的电脑的目录 " + dest);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(sendId).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
