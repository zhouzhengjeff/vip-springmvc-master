<%--
  Created by IntelliJ IDEA.
  User: zhouzheng
  Date: 2024/10/17
  Time: 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
    文件：<input type="file" name="file"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
