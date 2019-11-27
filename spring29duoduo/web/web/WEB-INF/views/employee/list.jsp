<%--
  Created by IntelliJ IDEA.
  User: 黄一百
  Date: 2019/11/21
  Time: 19:26
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
    <tr>
        <th>id</th>
        <th>username</th>
        <th>sex</th>
        <th>salary</th>
        <th>操作</th>

    </tr>
    <c:forEach items="${list.list}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.username}</td>
            <td>${emp.sex}</td>
            <td>${emp.salary}</td>
            <td><a href="/emp/delete?deptid=${emp.id}">删除</a></td>
        </tr>
    </c:forEach>


</table>
<br>
<br>
<button><a href="/emp/add">添加</a></button>
<br>
<br>
<button><a href="/emp/list?pageNum=1"> 首页</a></button>
<button><a href="/emp/list?pageNum=${list.prePage}"> 上一页</a></button>
<button><a href="/emp/list?pageNum=${list.nextPage}"> 下一页</a></button>
<button><a href="/emp/list?pageNum=${list.pages}"> 尾页</a></button>

<br>
<br>
    <c:forEach items="${list.navigatepageNums}" var="p">
        <button><a href="/emp/list?pageNum=${p}"> ${p}</a></button>
    </c:forEach>

</body>
</html>
