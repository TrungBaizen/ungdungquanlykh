<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/12/2024
  Time: 3:45 PM
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
    <title>Trang chỉnh sửa</title>
</head>
<body>
<form method="post" action="/customers/edit">
    <h1>Edit</h1>
    <input type="text" name="id" value="${customer.id}" readonly>
    <input type="text" name="name" value="${customer.name}">
    <input type="text" name="email" value="${customer.email}" >
    <input type="text" name="address" value="${customer.address}">
    <button>Submit</button>
    <button><a href="/customers">Back to list</a></button>
</form>
</body>
</html>