<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
    <head>
        <!-- 指定字符集 -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>修改用户</title>

        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/jquery-2.1.0.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
    </head>
    <body>
        <div class="container" style="width: 400px;">
        <h3 style="text-align: center;">修改联系人</h3>
        <form action="${pageContext.request.contextPath}/updateUserServlet" method="post">
            <!--  隐藏域 提交id-->
            <input type="hidden" name="id" value="${user.id}">

          <div class="form-group">
            <label for="name">名前：</label>
            <input type="text" class="form-control" id="name" name="name"  value="${user.name}" readonly="" placeholder="请输入姓名" />
          </div>

          <div class="form-group">
            <label>性別：</label>
              <c:if test="${user.gender == '男'}">
                  <input type="radio" name="gender" value="男" checked />男
                  <input type="radio" name="gender" value="女"  />女
              </c:if>

              <c:if test="${user.gender == '女'}">
                  <input type="radio" name="gender" value="男"  />男
                  <input type="radio" name="gender" value="女" checked  />女
              </c:if>


          </div>

          <div class="form-group">
            <label for="age">年齢：</label>
            <input type="text" class="form-control" value="${user.age}" id="age"  name="age" placeholder="请输入年龄" />
          </div>

          <div class="form-group">
            <label for="address">本籍：</label>
             <select name="address" id="address" class="form-select" >
                 <c:if test="${user.address == '東京都'}">
                     <option value="東京都"　selected>東京都</option>
                     <option value="埼玉県">埼玉県</option>
                     <option value="千葉県">千葉県</option>
                 </c:if>

                 <c:if test="${user.address == '埼玉県'}">
                     <option value="東京都">東京都</option>
                     <option value="埼玉県"　selected>埼玉県</option>
                     <option value="千葉県">千葉県</option>
                 </c:if>

                 <c:if test="${user.address == '千葉県'}">
                     <option value="東京都">東京都</option>
                     <option value="埼玉県">埼玉県</option>
                     <option value="千葉県"　selected>千葉県</option>
                 </c:if>
            </select>
          </div>

          <div class="form-group">
            <label for="line">Line：</label>
            <input type="text" id="line" class="form-control" value="${user.line}" name="line" placeholder="请输入Line号码"/>
          </div>

          <div class="form-group">
            <label for="email">Email：</label>
            <input type="text" id="email" class="form-control" value="${user.email}" name="email" placeholder="请输入邮箱地址"/>
          </div>

             <div class="form-group" style="text-align: center">
                <input class="btn btn-primary" type="submit" value="提交" />
                <input class="btn btn-outline-primary" type="reset" value="重置" />
                <input class="btn btn-outline-primary" type="button" value="返回"/>
             </div>
        </form>
        </div>
    </body>
</html>