<%--
  Created by IntelliJ IDEA.
  User: zhouzheng
  Date: 2024/10/18
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/script/index.js"></script>
</head>
<body>
<button id="btn">显示信息</button>

<br>

<img src="${pageContext.request.contextPath}/images/demo.png">


<script type="text/javascript">
    document.getElementById('btn').onclick = function () {
        fun();
    }
</script>
</body>
</html>
