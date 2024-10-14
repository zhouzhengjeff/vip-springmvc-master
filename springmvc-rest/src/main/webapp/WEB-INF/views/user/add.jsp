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
<form action="${pageContext.request.contextPath}/users/add" method="post">
    用户编号:<input type="text" name="id"/><br/>
    用户名称：<input type="text" name="name"/><br/>
    用户密码:<input type="password" name="password"/><br/>
    用户薪资：<input type="text" name="salary"/><br/>
    用户生日：<input type="text" name="birthday"/><br/>
    <input type="submit" value="添加"/>
</form>


</body>
</html>
