package com.kiz.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kiz.domain.Province;
import com.kiz.service.ProvinceService;
import com.kiz.service.impl.ProvinceServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "provinceServlet", value = "/provinceServlet")
public class ProvinceServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        ProvinceService service = new ProvinceServiceImpl();
//        List<Province> list = service.findAll();
//        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(list);
        ProvinceService service = new ProvinceServiceImpl();
        String json = service.findAllJson();
        System.out.println(json);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }


}
