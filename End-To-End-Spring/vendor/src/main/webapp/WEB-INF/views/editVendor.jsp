<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action ="updateVendor" method="post">

	Id: <input type="text" name="id" value="${vendor.id}"/><br/>
	Code: <input type="text" name="code" value="${vendor.code}"/><br/>
	Name : <input type="text" name="name" value="${vendor.name}"/><br/>
	Type: <select name="type">
		<option ${vendor.type == 'FINAANCIAL' ? 'selected':''}> FINANCIAL</option>
		<option ${vendor.type == 'AGRO' ? 'selected':''}> AGRO</option>
		<option ${vendor.type == 'REGULAR' ? 'selected':''}> REGULAR</option>
	</select>
	<br/>
	Email: <input type="text" name="email" value="${vendor.email}"/><br/>
	Phone: <input type="text" name="phone" value="${vendor.phone}"/><br/>
	Address: <textarea rows="5" cols="50" name="address">${vendor.address}</textarea><br/>
	
	<input type="submit" name="submit" />

</form>


</body>
</html>