<%--
  Created by IntelliJ IDEA.
  User: zhouzheng
  Date: 2024/10/18
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/users/login" method="post">
    用户名:<input type="text" name="name"><br>
    密码:<input type="password" name="password"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
