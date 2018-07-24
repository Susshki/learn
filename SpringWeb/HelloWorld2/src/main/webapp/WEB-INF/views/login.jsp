<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1><font color="red">${errorMessage}</font></h1>
	<form action="/springMVCHelloWorld/login.do" method="post">	
		UserName : <input type="text" name="username" />
		Password : <input type="text" name="password" />
		<input type="submit" name="Login" />
	</form>


</body>
</html>