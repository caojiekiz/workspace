package com.encap0282;
//0284
public class Account {
    private String name;
    private double bal;
    private String pwd;
    public Account() {
    }
    public Account(String name, double bal, String pwd) {
        this.setName(name);
        this.setBal(bal);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >=2 && name.length() <=4) {
            this.name = name;
        } else {
            System.out.println("名字字符长度超出范围在2-4,默认值 无名");
            this.name = "无名";
        }

    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        if(bal > 20) {
            this.bal = bal;
        } else {
            System.out.println("余额必须大于20,默认为0");
        }

    }

    public String getPwd() {
        return pwd;
    }
    //密码必须是六位
    public void setPwd(String pwd) {
        if(pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须为六位,默认000000");
            this.pwd = "000000";
        }
    }
    public void showInfo() {
        //可以增加权限的校验
        System.out.println("账号信息 name= " + name + " 余额="
                            + bal + "密码:" + pwd);
    }
}
