<%--
  Created by IntelliJ IDEA.
  User: Jin
  Date: 2019/1/12
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h1>Success</h1>
<c:if test="${not empty accounts}">
    <table>
        <th>ID</th>
        <th>NAME</th>
        <th>MONEY</th>
        <c:forEach items="${accounts}" var="account">
            <tr>
                <td>${account.id}</td>
                <td>${account.name}</td>
                <td>${account.money}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
