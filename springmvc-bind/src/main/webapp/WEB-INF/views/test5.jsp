<%--
  Created by IntelliJ IDEA.
  User: zhouzheng
  Date: 2024/10/14
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${userDTO.inters}" var="inter">${inter},</c:forEach>
</body>
</html>
