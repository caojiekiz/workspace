package com.atguigu.imperial.court.service.module;

import com.atguigu.imperial.court.entity.Emp;
import com.atguigu.imperial.court.exception.LoginFailedException;
import com.atguigu.imperial.court.service.api.EmpService;
import com.atguigu.imperial.court.service.base.ModelBaseServlet;
import com.atguigu.imperial.court.service.impl.EmpServiceImpl;
import com.atguigu.imperial.court.util.ImperialCourtConst;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "authServlet", value = "/auth")
public class AuthServlet extends ModelBaseServlet {
    private EmpService empService = new EmpServiceImpl();
    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String loginAccount = request.getParameter("loginAccount");
            String loginPassword = request.getParameter("loginPassword");
            Emp emp = empService.getEmpByLoginAccount(loginAccount,loginPassword);
            HttpSession session = request.getSession();
            session.setAttribute(ImperialCourtConst.LOGIN_EMP_ATTR_NAME,emp);
            //测试环境
            //String templateName = "temp";
            //processTemplate(templateName,request,response);
            //跳转到正常显示页面
            response.sendRedirect(request.getContextPath() + "/work?method=showMemorialsDigestList");
        } catch (Exception e) {
            //throw new RuntimeException(e);
            if(e instanceof LoginFailedException){
                request.setAttribute("message",e.getMessage());
                processTemplate("index",request,response);
            }else{
                throw new RuntimeException(e);
            }
        }
    }

    protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        String templateName = "index";
        processTemplate(templateName,request,response);
    }
}
