package cn.itcast.travel.web.servlet;

import cn.itcast.travel.service.impl.UserServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "activeUserServlet", value = "/activeUserServlet")
public class ActiveUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        if (code != null){
            UserServiceImpl service = new UserServiceImpl();
            boolean flag = service.active(code);
            String msg = null;
            if (flag){
                msg = "激活成功,请<a href='login.html'>登录</a>";
            }else{
                msg = "激活失败,请联系管理员!";
            }
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(msg);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }


}
