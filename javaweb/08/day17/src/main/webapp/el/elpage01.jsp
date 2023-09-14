<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  \${3 > 4}
    <%
        request.setAttribute("name","zhangsan");
        session.setAttribute("age","23");
    %>
<h3>el获取值</h3>
${requestScope.name}
${requestScope.age}
${sessionScope.age}
${sessionScope.haha}
</body>
</html>
