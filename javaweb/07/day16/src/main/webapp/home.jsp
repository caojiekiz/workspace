<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    boolean flag = false;
    if(cookies != null && cookies.length > 0) {
        for (Cookie cookie : cookies){
            String name = cookie.getName();
            if("lastTime".equals(name)){
                flag = true;
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日　HH:mm:ss");
                String str_date = sdf.format(date);
                cookie.setValue(str_date);
                cookie.setMaxAge(60*60*24*30);
                response.addCookie(cookie);
                String value = cookie.getValue();
                out.write("<h1>欢迎回来,您上次访问时间为:" + value + "</h1>");
                break;
            }
        }
    }
    if(cookies == null || cookies.length == 0 || flag == false){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str_date = sdf.format(date);
        Cookie cookie = new Cookie("lastTime","str_date");
        cookie.setMaxAge(60*60*24*30);//cookie存活时间一个月
        response.addCookie(cookie);
        out.write("<h1>您好,欢迎您首次访问</h1>");
    }

%>
</body>
</html>
