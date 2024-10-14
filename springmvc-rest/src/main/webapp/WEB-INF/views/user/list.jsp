<%--
  Created by IntelliJ IDEA.
  User: zhouzheng
  Date: 2024/10/9
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1" cellpadding="0" cellspacing="0">
    <thead>
    <tr>
        <th>用户编号</th>
        <th>用户名称</th>
        <th>用户密码</th>
        <th>用户薪资</th>
        <th>用户生日</th>
        <th>相关操作</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td>${user.salary}</td>
            <td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/></td>
            <td><a href="${pageContext.request.contextPath}/users/edit/${user.id}">修改</a>&nbsp;
                &nbsp;<a href="${pageContext.request.contextPath}/users/delete/${user.id}">删除</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<div>
    <button id="addBtn">添加用户</button>
</div>

<script type="text/javascript">
    document.getElementById("addBtn").onclick = function () {
        window.location.href = "${pageContext.request.contextPath}/users/add";
    }
</script>

</body>
</html>
