package com.tankgame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//绘图区
public class MyPanel extends JPanel implements KeyListener {
    Hero hero = null;
    //定义敌方坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTanksSize = 3;
    public MyPanel() {
        hero = new Hero(100,100);//初始化自己的坦克
        hero.setSpeed(5);//设置初始速度,默认为1
        //初始化敌方坦克
        for (int i = 0; i < enemyTanksSize; i++) {
            //创建一个敌方坦克
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            enemyTank.setDirect(2);//初始化方向向下
            //加入
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),1);
        //画出敌方坦克,遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),0);
        }
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
            case 1://1表示向右
                g.fill3DRect(x, y,60,10,false);
                g.fill3DRect(x, y + 30,60,10,false);
                g.fill3DRect(x + 10, y + 10,40,20,false);
                g.drawOval(x + 20, y + 10,20,20);
                g.drawLine(x + 30,y + 20,x + 60,y + 20);
                break;
            case 2://2表示向下
                g.fill3DRect(x, y,10,60,false);
                g.fill3DRect(x + 30, y,10,60,false);
                g.fill3DRect(x + 10, y + 10,20,40,false);
                g.drawOval(x + 10, y + 20,20,20);
                g.drawLine(x + 20,y + 30,x + 20,y + 60);
                break;
            case 3://1表示向左
                g.fill3DRect(x, y,60,10,false);
                g.fill3DRect(x, y + 30,60,10,false);
                g.fill3DRect(x + 10, y + 10,40,20,false);
                g.drawOval(x + 20, y + 10,20,20);
                g.drawLine(x + 30,y + 20,x ,y + 20);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //wdsa
        if(e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            hero.moveUp();
        } else if(e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        } else if(e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if(e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
