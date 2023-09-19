package com.kiz.web.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext对象被创建了");;
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("servletContext被销毁了..");;
    }
}
