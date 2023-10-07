package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
       // ctx.registerShutdownHook();
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        ctx.close();
    }
}
