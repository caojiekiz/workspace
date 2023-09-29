package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

public class APP {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
//        System.out.println(dataSource);
        //ApplicationContext ctx = new FileSystemXmlApplicationContext()
      //  BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao = ctx.getBean("bookDao",BookDao.class);
        bookDao.save();
    }
}
