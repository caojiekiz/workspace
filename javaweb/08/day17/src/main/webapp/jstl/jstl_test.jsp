<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.kiz.domain.User" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
    <title>Test</title>
</head>
<body>
    <%
        List list = new ArrayList();
        list.add(new User("张三",23,new Date()));
        list.add(new User("李四",33,new Date()));
        list.add(new User("王五",41,new Date()));
        request.setAttribute("list",list);
    %>
<table border="1" width="500" align="center">
    <tr>
        <th>ID:</th>
        <th>名前:</th>
        <th>年齢:</th>
        <th>生年月日:</th>
    </tr>
    <c:forEach items="${list}" var="user" varStatus="s">
        <c:if test="${s.count % 2 == 0}">
            <tr bgcolor="aqua">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birStr}</td>
            </tr>
        </c:if>
        <c:if test="${s.count % 2 != 0}">
            <tr bgcolor="blue">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birStr}</td>
            </tr>
        </c:if>

    </c:forEach>

</table>

</body>
</html>
