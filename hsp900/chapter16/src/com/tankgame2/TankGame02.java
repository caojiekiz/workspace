package com.tankgame2;

import javax.swing.*;
import java.awt.event.KeyListener;

public class TankGame02 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame02 tankGame01 = new TankGame02();
    }
    public TankGame02() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);//让JF监听键盘
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
