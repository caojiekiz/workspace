package com.kiz.web.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 敏感词汇过滤
 */

@WebFilter("/*")
public class SensitiveWordsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        try {
            ServletContext servletContext = filterConfig.getServletContext();
            //String realPath = servletContext.getRealPath("");
            String realPath = this.getClass().getResource("/プロファニティフィルター.txt").getPath();
            System.out.println(realPath);
            BufferedReader br = new BufferedReader(new FileReader(realPath));
            String line = null;
            while ((line = br.readLine()) != null){
                list.add(line);
            }
            br.close();
            System.out.println(list);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //创建代理,增强getParameter
        ServletRequest proxy_req = (ServletRequest) Proxy.newProxyInstance(servletRequest.getClass().getClassLoader(), servletRequest.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("getParameter")){
                    String value = (String) method.invoke(servletRequest, args);
                    if(value != null){
                        for (String str : list) {
                            if (value.contains(str)){
                                value = value.replaceAll(str,"***");
                            }
                        }
                    }
                    return value;
                }
                return method.invoke(servletRequest,args);
            }
        });
        //放行
        filterChain.doFilter(proxy_req,servletResponse);

    }
    private List<String> list = new ArrayList<String>();
    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
