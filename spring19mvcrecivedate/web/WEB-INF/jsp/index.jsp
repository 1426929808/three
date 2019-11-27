<%--
  Created by IntelliJ IDEA.
  User: 黄一百
  Date: 2019/11/11
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>page test  first</h1>
<br>
<br>
<h1>传递list数据给控制台</h1>
<form method="get" action="/list">
    id:<input type="text" name="emps[0].id"/>
    name:<input type="text" name="emps[0].name"/>
    sex:<input type="text" name="emps[0].sex"/>
    <br>
    id:<input type="text" name="emps[1].id"/>
    name:<input type="text" name="emps[1].name"/>
    sex:<input type="text" name="emps[1].sex"/>

    <input type="submit" value="提交">
</form>
<h1>绑定给数组</h1>
<form method="get" action="/array">
    name:<input type="text" name="name"/>
    name:<input type="text" name="name"/>
    name:<input type="text" name="name"/>
    <input type="submit" value="提交">
</form>
</body>
</html>
