<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
    <title>choose标签</title>
</head>
<body>
    <c:if test="true">
        <h1>天気がいい></h1>
    </c:if>
    <br>
    <%
        request.setAttribute("number",34);
    %>
    <c:choose>
        <c:when test="${number == 1}">月曜日</c:when>
        <c:when test="${number == 2}">火曜日</c:when>
        <c:when test="${number == 3}">水曜日</c:when>
        <c:when test="${number == 4}">木曜日</c:when>
        <c:when test="${number == 5}">金曜日</c:when>
        <c:when test="${number == 6}">土曜日</c:when>
        <c:when test="${number == 7}">日曜日</c:when>
        <c:otherwise>誤りがあった</c:otherwise>
    </c:choose>

</body>
</html>
