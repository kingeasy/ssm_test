<%--
  Created by IntelliJ IDEA.
  User: Jin
  Date: 2019/1/12
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<a href="account/findAll">查找所有账户</a>

<br>
<br>
<br>
<form action="account/transfer" method="post">
    转账方：<input name="s" type="text"><br>
    收钱方：<input name="t" type="text"><br>
    金额：<input name="m" type="text"><br>
    <input type="submit" value="确认转账">
</form>
</body>
</html>
