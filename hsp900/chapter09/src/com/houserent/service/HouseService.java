package com.houserent.service;
import com.houserent.domain.House;

public class HouseService {
    private House[] houses;//保存house对象
    private int houseNums = 1;
    private int idCounter = 1;
    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "222",
                "qingjingze", 50000, "未出租");
    }
    public boolean add(House newHouse) {
        if (houseNums == houses.length) {//不能再添加
            System.out.println("数组已满,不能再添加了!");
            return false;
        }
        houses[houseNums++] = newHouse;
        idCounter++;
        newHouse.setId(++idCounter);
        return true;
    }
    public House findId(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if(findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }
    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = index; i < houseNums; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNums] = null;
        return true;
    }
    public House[] list() {
        return houses;
    }

}
