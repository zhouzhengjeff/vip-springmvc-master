<%--
  Created by IntelliJ IDEA.
  User: zhouzheng
  Date: 2024/10/12
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/details/convert" method="post">
    日期：<input type="text" name="birthday"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
