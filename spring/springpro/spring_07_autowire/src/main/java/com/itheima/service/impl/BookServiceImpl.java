package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
//    private UserDao userDao;

//    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
//        this.bookDao = bookDao;
//        this.userDao = userDao;
//    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    public void save() {
        System.out.println("book service save...");
        bookDao.save();
//        userDao.save();
    }
}
