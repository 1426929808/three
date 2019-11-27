<%--
  Created by IntelliJ IDEA.
  User: 黄一百
  Date: 2019/10/24
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>stuid</th>
        <th>stuname</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${pageInfo.list}" var="student">
        <tr>
            <td>${student.stuid}</td>
            <td>${student.stuname}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<a href="/index?page=1&pageSize=${pageInfo.pageSize}">首页</a>
<a href="/index?page=${pageInfo.prePage}&pageSize=${pageInfo.pageSize}">上一页</a>
<a href="/index?page=${pageInfo.nextPage}&pageSize=${pageInfo.pageSize}">下一页</a>
<a href="/index?page=${pageInfo.pages}&pageSize=${pageInfo.pageSize}">尾页</a>

<ul>
    <c:forEach items="${pageInfo.navigatepageNums}" var="num">
        <li><a href="/index?page=${num}&pageSize=${pageInfo.pageSize}">${num}</a></li>
    </c:forEach>
</ul>
</body>
</html>
