package com.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    private MyPanel mp = null;
    public static void main(String[] args) {
         new DrawCircle();
    }
    public DrawCircle() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
class MyPanel extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
       // g.drawOval(100,100,1000,1000);
        //获得图片正确位置相对路径和绝对路径
        Image image = Toolkit.getDefaultToolkit().getImage("out/production/chapter16/123.png");
        g.drawImage(image,10,10,800,600,this);
    }
}