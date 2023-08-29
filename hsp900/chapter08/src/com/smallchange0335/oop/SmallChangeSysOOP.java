package com.smallchange0335.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    //定义
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    //2.完成零钱通明细
    String details = "-------------零钱通明细-------------";
    //3.完成收益入账
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");
    //4.消费
    String note = "";//消费说明

    public void mainMenu() {
        do {
            System.out.println("\n=============选择零钱通菜单=============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退        出");
            System.out.println("请选择(1-4): ");
            key = scanner.next();
            switch (key) {
                case "1" :
                    this.details();
                    break;
                case "2" :
                    this.income();
                    break;
                case "3" :
                    this.pay();
                    break;
                case "4" :
                    this.exit();
                    break;
                default:
                    if(loop == false) {}
                    System.out.println("选择有误,请重新选择");
            }

        }while (loop);
    }
    public void details() {
        System.out.println(details);
    }
    public void income() {
        System.out.println("收益入账金额:");
        money = scanner.nextDouble();
        if(money <= 0) {
            System.out.println("收益入账金额需要大于0");
            return;
        }
        balance += money;
        date = new Date();//获取当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    public void pay() {
        System.out.println("消费金额:");
        money = scanner.nextDouble();
        if(money <= 0 || money > balance) {
            System.out.print("你的消费金额应该在0~" + balance);
            return;
        }
        System.out.print("消费说明:");
        note = scanner.next();
        balance -= money;
        date = new Date();//获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    public void exit() {
        String choice = "";
        while (true) {
            System.out.println("你确定要退出吗? y/n");
            choice = scanner.next();
            if("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if(choice.equals("y")) {
            loop = false;
        }
    }
}
