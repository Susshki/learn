<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

<table>
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th></th>
	</tr>
</table>
<c:forEach items="${documents}" var="document">
<tr>
	<td>${document.id}</td>
	<td>${document.name}</td>
	<td><a href="download?id=${document.id}">Download</a></td>
</tr>
</c:forEach>


</body>
</html>