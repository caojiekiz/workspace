package com.kiz.web.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String uri = request.getRequestURI();
        //排除过滤资源
        if(uri.contains("/login.jsp") || uri.contains("/loginServlet") || uri.contains("/css/") || uri.contains("/js/") || uri.contains("/fonts") || uri.contains("/checkCodeServlet")){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            Object user = request.getSession().getAttribute("user");
            if(user != null){
              filterChain.doFilter(servletRequest,servletResponse);
            }else{
                request.setAttribute("login_msg","ログインしていません！");
                request.getRequestDispatcher("/login.jsp").forward(request,servletResponse);
            }
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
