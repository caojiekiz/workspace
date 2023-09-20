package com.kiz.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "findUserServlet", value = "/findUserServlet")
public class FindUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        response.setContentType("application/json;charset=utf-8");
        Map<String,Object> map = new HashMap<String,Object>();

        if("tom".equals(username)){
            map.put("userExsit",true);
            map.put("msg","此用户名太受欢迎,请更换一个");
        }else{
            map.put("userExsit",false);
            map.put("msg","用户名可用");
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(),map);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }


}
