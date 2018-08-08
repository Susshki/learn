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
		<td>ID</td>
		<td>CODE</td>
		<td>NAME</td>
		<td>TYPE</td>
		<td>EMAIL</td>
		<td>PHONE</td>
		<td>ADDRESS</td>		
	</tr>
	<c:forEach items="${vendors}" var="vendor">
		<tr>
		<td>${vendor.id}</td>
		<td>${vendor.code}</td>
		<td>${vendor.name}</td>
		<td>${vendor.type}</td>
		<td>${vendor.email}</td>
		<td>${vendor.phone}</td>
		<td>${vendor.address}</td>	
		</tr>
	</c:forEach>

</table>



</body>
</html>