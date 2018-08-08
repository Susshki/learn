<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>D-AIRLINES Registration Page</title>
</head>
<body>
<h2> User Registration</h2>

Already Have an account?Please <a href="showlogin">Login Here</a>

<form method="POST" action="register">
	FIRST NAME: <input type="text" name="firstName"/>
	LAST NAME: <input type="text" name="lastName"/>
	EMAIL: <input type="text" name="email"/> 
	PASSCODE: <input type="text" name="passcode"/>
	CONFIRM PASSCODE: <input type="text" name="confirmPasscode"/>  
	PHONE: <input type="text" name="phone"/>
	
	<input type="submit" value="register" />
</form>

</body>
</html>