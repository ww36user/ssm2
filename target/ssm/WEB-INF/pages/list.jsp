<%--
  Created by IntelliJ IDEA.
  User: nick
  Date: 2020-08-02
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>

<c:forEach items="${accounts}" var="account">
    id=${account.id},name=${account.name},money=${account.money} <br/>
</c:forEach>
</body>
</html>
