<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<th>No</th>
<th>UserName</th>
<th>Salary</th>
<c:forEach var="customuser" items="${customer}" varStatus="status">
<tr>
<td>${customuser.id}</td>
<td>${customuser.name}</td>
<td>${customuser.salary}</td>
</tr>
</c:forEach>
</table>

<table border="1">
<th>No</th>
<th>UserName</th>
<th>Salary</th>
<c:forEach var="user" items="${getUserById}" varStatus="status">
<tr>
<td>${user.id}</td>
<td>${user.name}</td>
<td>${user.salary}</td>
</tr>
</c:forEach>
</table>
</html>