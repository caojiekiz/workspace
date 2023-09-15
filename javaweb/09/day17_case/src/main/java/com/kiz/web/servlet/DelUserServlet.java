package com.kiz.web.servlet;

import com.kiz.domain.User;
import com.kiz.service.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

@WebServlet(name = "delUserServlet", value = "/delUserServlet")
public class DelUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        UserServiceImpl service = new UserServiceImpl();
        service.deleteUser(id);
        response.sendRedirect(request.getContextPath() + "/userListServlet");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
