

package com.tankgame6;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class TankGame06 extends JFrame {
    MyPanel mp = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TankGame06 tankGame01 = new TankGame06();
    }
    public TankGame06() {
        System.out.println("请输入选择 1:新游戏 2:继续上局");
        String key = scanner.next();
        mp = new MyPanel(key);
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1300,950);
        this.addKeyListener(mp);//让JF监听键盘
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //super.windowClosing(e);
                Recorder.keepRecord();
                System.out.println("监听到关闭窗口");
                System.exit(0);
            }
        });
    }
}
