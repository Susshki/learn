<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 tdansitional//EN" "http://www.w3.org/td/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
	<th>Id</th>
	<th>Code</th>
	<th>Name</th>
	<th>Type</th>
	<th>Email</th>
	<th>Phone</th>
	<th>Address</th>
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
		<td><a href="editVendor?id=${vendor.id}">Update</a></td>
		<td><a href="deleteVendor?id=${vendor.id}">Delete</a></td>	
	</tr>	
</c:forEach>

</table>

<a href="showCreateVendor">Add Location</a>


</body>
</html>