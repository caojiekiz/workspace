package com.kiz.web.servlet;

import com.kiz.domain.User;
import com.kiz.service.impl.UserServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "loginServlet", value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置编码
        request.setCharacterEncoding("utf-8");
        //2.获取数据
        String verifycode = request.getParameter("verifycode");
        //3.验证码校验
        HttpSession session = request.getSession();
        String checkcode_server = (String)session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER");//确保验证码一次性
        Map<String, String[]> map = request.getParameterMap();
        if(!checkcode_server.equalsIgnoreCase(verifycode)){
            request.setAttribute("login_msg","確認コードが誤りがあった！");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
            return;
        }
        //4.封装user对象
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        //5.调用service查询
        UserServiceImpl service = new UserServiceImpl();
        User loginUser = service.login(user);
        if (loginUser != null){
            //登录成功
        }else{
            request.setAttribute("login_msg","ユーザー名またパスワードが誤りがあった！");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
        //6.判断是否登录成功
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }


}
