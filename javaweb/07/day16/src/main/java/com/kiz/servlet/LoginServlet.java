package com.kiz.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("checkCode");
        //获取生成的验证码
        HttpSession session = request.getSession();
        String checkCode_session = (String)session.getAttribute("checkCode_session");
        //删除session中存储的验证码
        //
        session.removeAttribute("checkCode_session");
        if(checkCode_session != null && checkCode_session.equalsIgnoreCase(checkCode)){//equalsIgnoreCase忽略大小写
            if("zhangsan".equals(username) && "123".equals(password)){
                //登录成功
                session.setAttribute("user",username);
                response.sendRedirect(request.getContextPath() + "/success.jsp");
            }else{
                //登录失败
                request.setAttribute("login_error","ユーザー名またはパスワードが間違っています.");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }
        }else{
            request.setAttribute("cc_error","認証コードが間違っています.");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }


}
