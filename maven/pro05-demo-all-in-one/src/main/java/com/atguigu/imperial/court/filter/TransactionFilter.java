package com.atguigu.imperial.court.filter;

import com.atguigu.imperial.court.util.JDBCUtils;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class TransactionFilter implements Filter {
    private static Set<String> staticResourceExtNameSet;
    static {
        staticResourceExtNameSet = new HashSet<>();
        staticResourceExtNameSet.add(".png");
        staticResourceExtNameSet.add(".jpg");
        staticResourceExtNameSet.add(".css");
        staticResourceExtNameSet.add(".js");
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //前置操作,排除静态资源
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String servletPath = request.getServletPath();
        if(servletPath.contains(".")){
            String extName = servletPath.substring(servletPath.lastIndexOf("."));
            if (staticResourceExtNameSet.contains(extName)) {
                filterChain.doFilter(servletRequest, servletResponse);
                return;
            }
        }
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            filterChain.doFilter(servletRequest,servletResponse);
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            String message = e.getMessage();
            request.setAttribute("systemMessage",message);
            //将请求转发到指定页
            request.getRequestDispatcher("/").forward(request,servletResponse);
        } finally {
            JDBCUtils.releaseConnection(connection);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }
    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
