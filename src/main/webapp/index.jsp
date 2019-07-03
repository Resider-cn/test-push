<%--
  Created by IntelliJ IDEA.
  User: Rz
  Date: 2019/6/27
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Res' Web</title>
</head>
<body>
<h2>This is the page</h2>
<a href="account/findAll">查询所有</a>
<hr/>

<form action="account/insert" method="post">
    姓名:<input type="text" name="name"><br/>
    金额:<input type="text" name="money"><br/>
    <input type="submit" value="submit">
</form>

<hr/>

<form action="account/transfer" method="post">
    收款人:<input type="text" name="nameIn"><br/>
    转账人:<input type="text" name="nameOut"><br/>
    金额:<input type="text" name="money"><br/>
    <input type="submit" value="submit">
</form>
</body>
</html>
