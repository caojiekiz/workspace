<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script>
        //页面加载完毕
        window.onload = function () {
            document.getElementById("img").onclick = function (){
                this.src="/day16/checkCodeServlet?time=" + new Date.getTime();
            }
        }
    </script>
    <style>
        div{
            color: red;
        }
    </style>
</head>
<body>
    <form action="/day16/loginServlet" method="post">
        <table>
            <tr>
                <td>ユーザー名:</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>パスワード:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>確認コード:</td>
                <td><input type="text" name="checkCode"></td>
            </tr>
            <tr>
                <td colspan="2"><img id="img" src="/day16/checkCodeServlet"></td>
            </tr>
            <tr>
                <td><input type="submit" value="登録"></td>
            </tr>
        </table>
    </form>
    <div>
        <%=request.getAttribute("cc_error") == null ? "" : request.getAttribute("cc_error")%>
    </div>
    <div>
        <%=request.getAttribute("login_error") == null ? "" : request.getAttribute("login_error")%>
    </div>
</body>
</html>
