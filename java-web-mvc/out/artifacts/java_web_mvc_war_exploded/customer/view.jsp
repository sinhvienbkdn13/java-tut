<%--
  Created by IntelliJ IDEA.
  User: Tommy
  Date: 7/22/2019
  Time: 9:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View customer</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/customers">Back to customer list</a>
</p>
<table>
    <tr>
        <td>Id: </td>
        <td>${customer.id}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${customer.name}</td>
    </tr>
    <tr>
        <td>Email: </td>
        <td>${customer.email}</td>
    </tr>
    <tr>
        <td>Address: </td>
        <td>${customer.address}</td>
    </tr>
</table>
</body>
</html>
