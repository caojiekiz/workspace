package com.kiz.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "cookieTest", value = "/cookieTest")
public class CookieTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Cookie[] cookies = request.getCookies();
        boolean flag = false;
        if(cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies){
                String name = cookie.getName();
                if("lastTime".equals(name)){
                    flag = true;
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日　HH:mm:ss");
                    String str_date = sdf.format(date);
                    cookie.setValue(str_date);
                    cookie.setMaxAge(60*60*24*30);
                    response.addCookie(cookie);
                    String value = cookie.getValue();
                    response.getWriter().write("<h1>欢迎回来,您上次访问时间为:" + value + "</h1>");
                    break;
                }
            }
        }
        if(cookies == null || cookies.length == 0 || flag == false){
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str_date = sdf.format(date);
            Cookie cookie = new Cookie("lastTime","str_date");
            cookie.setMaxAge(60*60*24*30);//cookie存活时间一个月
            response.addCookie(cookie);
            response.getWriter().write("<h1>您好,欢迎您首次访问</h1>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }


}
