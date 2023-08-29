package com.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y,20,20);
    }
    //字符输出,该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }
    //当某个键按下,该方法会触发
    @Override
    public void keyPressed(KeyEvent e)  {
        System.out.println((char)e.getKeyCode() + "被按下...");
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;
        } else if(e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }
        this.repaint();
    }
    //当某个键释放,该方法会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}