<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
    <title>forEach标签</title>
</head>
<body>
    <c:if test="true">
        <h1>天気がいい></h1>
    </c:if>
    <br>
    <c:forEach begin="1" end="10" var="i" step="1">
        ${i}<br>
    </c:forEach>
    <br>
    <c:forEach begin="1" end="10" var="i" step="2" varStatus="s">
        ${i} ${s.index} ${s.count}<br>
    </c:forEach>
</body>
</html>
