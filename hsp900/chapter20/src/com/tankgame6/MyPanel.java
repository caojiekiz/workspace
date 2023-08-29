package com.tankgame6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Vector;

//绘图区
public class MyPanel extends JPanel implements KeyListener,Runnable {
    Hero hero = null;
    //定义敌方坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    Vector<Node> nodes = new Vector<>();

    //定义一个vector,用于存放炸弹
    Vector<Bomb> bombs = new Vector<>();

    int enemyTanksSize = 3;
    //定义三张炸弹图片,用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel(String key) {
        File file = new File(Recorder.getRecordFile());
        if(file.exists()) {
            nodes = Recorder.getNodesAndEnemyTankRec();
        } else {
            System.out.println("文件不存在,只能开启新的游戏");
            key = "1";
        }

        Recorder.setEnemyTanks(enemyTanks);
        hero = new Hero(500,100);//初始化自己的坦克
        hero.setSpeed(5);//设置初始速度,默认为1
        switch (key) {
            case "1":
                //初始化敌方坦克
                for (int i = 0; i < enemyTanksSize; i++) {
                    //创建一个敌方坦克
                    EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
                    enemyTank.setEnemyTanks(enemyTanks);
                    enemyTank.setDirect(2);//初始化方向向下
                    new Thread(enemyTank).start();
                    Shot shot = new Shot(enemyTank.getX() + 20,enemyTank.getY() + 60,enemyTank.getDirect());
                    enemyTank.shots.add(shot);
                    new Thread(shot).start();
                    //加入
                    enemyTanks.add(enemyTank);
                }
                break;
            case "2":
                //继续上局
                for (int i = 0; i < nodes.size(); i++) {
                    Node node = nodes.get(i);
                    //创建一个敌方坦克
                    EnemyTank enemyTank = new EnemyTank(node.getX(),node.getY());
                    enemyTank.setEnemyTanks(enemyTanks);
                    enemyTank.setDirect(node.getDirect());//初始化方向向下
                    new Thread(enemyTank).start();
                    Shot shot = new Shot(enemyTank.getX() + 20,enemyTank.getY() + 60,enemyTank.getDirect());
                    enemyTank.shots.add(shot);
                    new Thread(shot).start();
                    //加入
                    enemyTanks.add(enemyTank);
                }
                break;
            default:
                System.out.println("你的输入有误...");
        }

        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/Bomb-1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/Bomb-2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/Bomb-3.gif"));
        //播放指定的音乐
        new PlayWav("src/game-opener-222.wav").start();
    }
    public void showInfo(Graphics g) {
        g.setColor(Color.BLACK);
        Font font = new Font("宋体",Font.BOLD, 25);
        g.setFont(font);
        g.drawString("您累计击毁敌方坦克", 1020,30);
        drawTank(1020,60,g,0,0);
        g.setColor(Color.black);
        g.drawString(Recorder.getAllEnemyTankNum() + "",1080,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        showInfo(g);
        if(hero != null && hero.isLive) {
            drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),1);
        }

        //画出hero设计的子弹
//        if(hero.shot != null && hero.shot.isLive == true) {
//            //g.fill3DRect(hero.shot.x,hero.shot.y,1,1,false);
//            g.draw3DRect(hero.shot.x,hero.shot.y,1,1,false);
//        }
        //将hero的子弹集合shots,遍历取出
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if(shot != null && shot.isLive == true) {
                g.draw3DRect(shot.x, shot.y,1,1,false);
            } else {
                hero.shots.remove(shot);
            }
        }
        //如果bombs 集合中有对象,就画出
        for(int i = 0; i < bombs.size(); i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Bomb bomb = bombs.get(i);
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60,60,this);
            } else if(bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60,60,this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60,60,this);
            }
            bomb.lifeDown();
            if(bomb.life == 0) {
                bombs.remove(bomb);
            }
        }
        //画出敌方坦克,遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if(enemyTank.isLive) {//
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    Shot shot = enemyTank.shots.get(j);
                    if (shot.isLive) {
                         g.draw3DRect(shot.x, shot.y, 1, 1, false);
                    } else {
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }
    }
    public void hitEnemyTank() {
        for (int j = 0; j < hero.shots.size(); j++) {
            Shot shot = hero.shots.get(j);
            if (shot != null && hero.shot.isLive) {
                for (int i = 0; i < enemyTanks.size();i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(hero.shot, enemyTank);
                }
            }
        }
        if(hero.shot != null && hero.shot.isLive ) {
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                hitTank(hero.shot, enemyTank);
            }
        }
    }
    public void hitHero() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if(hero.isLive && shot.isLive) {
                    hitTank(shot, hero);
                }
            }
        }
    }

    public void hitTank(Shot s, Tank enemyTank) {
        switch (enemyTank.getDirect()) {
            case 0://坦克向上
            case 2://坦克向下
                if(s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                    && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //当我的子弹击中敌人坦克后,将enemyTank从Vetor拿掉
                    enemyTanks.remove(enemyTank);
                    //
                    if(enemyTank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1:
            case 3:
                if(s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60 &&
                    s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                    if(enemyTank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
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
            if(hero.getY() > 0) {
                hero.moveUp();
            }
        } else if(e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            if(hero.getX() + 60 < 1000) {
                hero.moveRight();
            }

        } else if(e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            if(hero.getX() + 60 < 750) {
                hero.moveDown();
            }
        } else if(e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            if(hero.getX() > 0) {
                hero.moveLeft();
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
//            if(hero.shot == null || !hero.shot.isLive) {
//                hero.shotEnemyTank();
//            }
            //发射多颗子弹
            hero.shotEnemyTank();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //判断是否击中了敌人的坦克
            hitEnemyTank();
            hitHero();
            this.repaint();
        }
    }
}
