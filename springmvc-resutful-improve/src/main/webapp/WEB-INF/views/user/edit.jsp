<%--
  Created by IntelliJ IDEA.
  User: zhouzheng
  Date: 2024/10/9
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/users/edit" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="hidden" name="id" value="${user.id}"/><br/>
    用户名称：<input type="text" name="name" value="${user.name}"/><br/>
    用户密码:<input type="password" name="password" value="${user.password}"/><br/>
    用户薪资：<input type="text" name="salary" value="${user.salary}"/><br/>
    <input type="submit" value="更新"/>
</form>


</body>
</html>
