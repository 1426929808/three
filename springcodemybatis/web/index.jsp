<%--
  Created by IntelliJ IDEA.
  User: 黄一百
  Date: 2019/11/6
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>username</th>
        <th>sex</th>
        <th>salary</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${pageInfo.list}" var="emp">
    <tr>
        <td>${emp.id}</td>
        <td>${emp.username}</td>
        <td>${emp.sex}</td>
        <td>${emp.salary}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/index?pageNum=1&pageSize=${pageInfo.pageSize}">首页</a>
<a href="/index?pageNum=${pageInfo.prePage}&pageSize=${pageInfo.pageSize}">上一页</a>
<a href="/index?pageNum=${pageInfo.nextPage}&pageSize=${pageInfo.pageSize}">下一页</a>
<a href="/index?pageNum=${pageInfo.pages}&pageSize=${pageInfo.pageSize}">尾页</a>

<ul>
    <c:forEach items="${pageInfo.navigatepageNums}" var="num">
        <li><a href="/index?pageNum=${num}&pageSize=${pageInfo.pageSize}">${num}</a></li>
    </c:forEach>
</ul>
</body>
</html>
