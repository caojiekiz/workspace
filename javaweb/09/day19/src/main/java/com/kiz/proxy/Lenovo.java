package com.kiz.proxy;

public class Lenovo implements SaleComputer{
    @Override
    public String sale(double money) {
        System.out.println("spend " + money + " to buy a Lenovo computer.");
        return "lenovo";
    }

    @Override
    public void show() {
        System.out.println("show the computer.");
    }
}
