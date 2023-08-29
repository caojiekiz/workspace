package com.tankgame;

import javax.swing.*;
import java.awt.*;

//绘图区
public class MyPanel extends JPanel {
    Hero hero = null;
    public MyPanel() {
        hero = new Hero(100,100);//初始化自己的坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        drawTank(hero.getX(),hero.getY(),g,0,0);
    }
    //画出坦克
    /**
     * @param x tk左上角坐标
     * @param y tk右上角坐标
     * @param g 画笔
     * @param direct 坦克方向
     * @param type 坦克类型

     */
    public void drawTank(int x,int y,Graphics g,int direct,int type) {
        switch (type) {
            case 0://己方坦克
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        switch (direct) {
            case 0://0表示向上
                g.fill3DRect(x, y,10,60,false);
                g.fill3DRect(x + 30, y,10,60,false);
                g.fill3DRect(x + 10, y + 10,20,40,false);
                g.drawOval(x + 10, y + 20,20,20);
                g.drawLine(x + 20,y + 30,x + 20,y);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

}
