<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html>
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户信息管理系统</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
<%--    <script src="js/jquery-2.1.0.min.js"></script>--%>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
    <script>
        function deleteUser(id){
            //用户安全提示
            if(confirm("削除しますか？")){
                location.href="${pageContext.request.contextPath}/delUserServlet?id=" + id;
            }
        }
        window.onload = function (){
            document.getElementById("delSelected").onclick = function (){
                if(confirm("削除しますか?")){
                    var flag = false;
                    var cbs = document.getElementsByName("uid");
                    for (var i = 0; i < cbs.length; i++) {
                        if (cbs[i].checked) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag){
                        document.getElementById("delId").submit();
                    }

                }

            }
            document.getElementById("selectAll").onclick = function (){
                var cbs = document.getElementsByName("uid");
                for (var i = 0; i < cbs.length; i++) {
                    cbs[i].checked = this.checked;
                }
            }
        }
    </script>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">ユーザーリスト</h3>
    <div style="float: left;margin: 5px">
        <form class="row row-cols-lg-auto g-3 align-items-center" action="${pageContext.request.contextPath}/findUserByPageServlet" method="post">
            <div class="col-12">
                <label class="visually-hidden" for="inlineFormInputGroupUsername"
                >Username</label>
                <div class="input-group">
                    <div class="input-group-text">名前</div>
                    <input type="text" name="name" value="${condition.name[0]}" class="form-control" id="inlineFormInputGroupUsername"/>
                </div>
            </div>
            <div class="col-12">
                <label class="visually-hidden" for="inlineFormInputGroupSeki"
                >Seki</label>
                <div class="input-group">
                    <div class="input-group-text">本籍</div>
                    <input type="text" name="address" value="${condition.address[0]}" class="form-control" id="inlineFormInputGroupSeki"/>
                </div>
            </div>
            <div class="col-12">
                <label class="visually-hidden" for="inlineFormInputGroupEmail"
                >Email</label>
                <div class="input-group">
                    <div class="input-group-text">Email</div>
                    <input type="text" name="email" value="${condition.email[0]}" class="form-control" id="inlineFormInputGroupEmail"/>
                </div>
            </div>
            <div class="col-12">
                <button type="submit" class="btn btn-primary">Search</button>
            </div>
        </form>
    </div>
    <div style="float: right;margin: 5px">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/add.jsp">添加联系人</a>
        <a class="btn btn-primary" href="javascript:void(0);" id="delSelected">删除选中</a>
    </div>
    <form id="delId" action="${pageContext.request.contextPath}/delSelectedServlet" method="post">
        <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th><input type="checkbox" id="selectAll"></th>
            <th>番号</th>
            <th>名前</th>
            <th>性別</th>
            <th>年齢</th>
            <th>本籍</th>
            <th>LINE</th>
            <th>メール</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${pb.list}" var="user" varStatus="s">
        <tr>
            <th><input type="checkbox" name="uid" value="${user.id}"></th>
            <td>${s.count}</td>
            <td>${user.name}</td>
            <td>${user.gender}</td>
            <td>${user.age}</td>
            <td>${user.address}</td>
            <td>${user.line}</td>
            <td>${user.email}</td>
            <td><a class="btn btn-outline-primary btn-sm" href="${pageContext.request.contextPath}/findUserServlet?id=${user.id}">修改</a>&nbsp;
                <a class="btn btn-outline-primary btn-sm" href="javascript:deleteUser(${user.id})">削除</a></td>
        </tr>
        </c:forEach>
<%--        <tr>--%>
<%--            <td colspan="8" align="center"><a class="btn btn-primary" href="add.html">添加联系人</a></td>--%>
<%--        </tr>--%>
    </table>
    </form>
    <div>
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <c:if test="${pb.currentPage == 1}">
                    <li class="page-item disabled">
                </c:if>
                <c:if test="${pb.currentPage != 1}">
                    <li class="page-item">
                </c:if>
                    <a class="page-link" href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${pb.currentPage - 1}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                    </li>
                <c:forEach begin="1" end="${pb.totalPage}" var="i">
                    <c:if test="${pb.currentPage == i}">
                        <li class="page-item active"><a class="page-link" href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${i}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}">${i}</a></li>
                    </c:if>
                    <c:if test="${pb.currentPage != i}">
                        <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${i}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}">${i}</a></li>
                    </c:if>
                </c:forEach>
                <c:if test="${pb.currentPage == pb.totalPage}">
                    <li class="page-item disabled">
                </c:if>
                <c:if test="${pb.currentPage != pb.totalPage}">
                    <li class="page-item">
                </c:if>
                    <a class="page-link" href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${pb.currentPage + 1}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
                <span style="font-size: 25px;margin-left: 5px;">
                    共${pb.totalCount}条记录,共${pb.totalPage}ページ
                </span>
            </ul>
        </nav>
    </div>
</div>
</body>
</html>
