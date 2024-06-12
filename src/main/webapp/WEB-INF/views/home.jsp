<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/12/2024
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Trang chủ</title>
</head>
<body>
<div class="main">
    <div class="name-table">
        <h1>Danh sách khách hàng</h1>
    </div>
    <table class="show-customer" >
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Action</th>
        </tr>
        <c:forEach var="item" items="${customerList}">
            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.email}</td>
                <td>${item.address}</td>
                <td>
                    <button onclick="window.location.href='/customers/edit/${item.id}'">Update</button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>