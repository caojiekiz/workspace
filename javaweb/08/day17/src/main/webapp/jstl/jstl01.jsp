<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
    <title>IF标签</title>
</head>
<body>
    <c:if test="true">
        <h1>天気がいい></h1>
    </c:if>
    <br>
    <%
        List list = new ArrayList();
        list.add("aaa");
        request.setAttribute("list",list);
        request.setAttribute("number",3);

    %>
    <c:if test="${not empty list}">
        遍历集合
    </c:if>
    <br>
    <c:if test="${number % 2 != 0}">
        ${number}为奇数
    </c:if>
</body>
</html>
