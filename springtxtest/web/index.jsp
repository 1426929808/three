<%--
  Created by IntelliJ IDEA.
  User: 黄一百
  Date: 2019/10/31
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${pageInfo.list}" var="yuangong">
        <tr>
            <td>${yuangong.id}</td>
            <td>${yuangong.name}</td>
            <td>${yuangong.age}</td>
            <td><a href="${pageContext.request.contextPath}/del?id=${yuangong.id}&page=1&pageSize=${pageInfo.pageSize}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

        <button><a href="/index?page=1&pageSize=${pageInfo.pageSize}">首页</a></button>
        <button><a href="/index?page=${pageInfo.prePage}&pageSize=${pageInfo.pageSize}">上一页</a></button>
        <button><a href="/index?page=${pageInfo.nextPage}&pageSize=${pageInfo.pageSize}">下一页</a></button>
        <button><a href="/index?page=${pageInfo.pages}&pageSize=${pageInfo.pageSize}">尾页</a></button>

            <ul>
                <c:forEach items="${pageInfo.navigatepageNums}" var="num">
                    <li><a href="/index?page=${num}&pageSize=${pageInfo.pageSize}">${num}</a></li>
                </c:forEach>
            </ul>
</body>
</html>
