<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 01/08/2022
  Time: 9:30 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>User Manager Application</title>
</head>
<body>
<center>
    <h1>User Manager</h1>
    <h2>
        <a href="users?action=users">List All Users</a>
    </h2>
    <h2>
        <a href="/users?action=sort"> Sort By Name</a>
    </h2>
    <h2>
        <a href="/users?action=create"> Add New User</a>
    </h2>
    <form action="/users">
        <input type="text" name="country">
        <input type="submit" name="action" value="findByCountry">
    </form>

    <form action="/users">
        <input type="text" name="name">
        <input type="submit" name="action" value="findByName">
    </form>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption>
            <h2>Danh sách User</h2>
        </caption>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>EMAIL</th>
            <th>COUNTRY</th>
            <th>ACTIONS</th>
        </tr>
        <c:forEach items="${listUser}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.country}</td>
                <td>
                    <a href="/users?action=edit&id=${user.id}"> Edit</a>
                    <a href="/users?action=delete&id=${user.id}" onclick="sendIdToDeleteForm(${user.id})">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>