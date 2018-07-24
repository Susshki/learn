<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<title> Login Page</title>
<body>

<h1><font color="red>">${errorMessage}</font></h1>
<form action="/login.do" method="post">

	
	UserName : <input type="text" name="username"/>
	Password : <input type="password" name="password"/>
	<input type="submit" name="Login"/>
</form>

</body>
</html>