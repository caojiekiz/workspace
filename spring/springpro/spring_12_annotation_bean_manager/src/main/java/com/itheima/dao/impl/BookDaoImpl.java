package com.itheima.dao.impl;


import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @PostConstruct
    public void init(){
        System.out.println("init...");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }
    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
