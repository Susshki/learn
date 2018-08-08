<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Vendor</title>
</head>
<body>

<form action ="saveVendor" method="post">

	Id: <input type="text" name="id" /><br/>
	Code: <input type="text" name="code" /><br/>
	Name : <input type="text" name="name" /><br/>
	Type: <select name="type">
		<option value="FINANCIAL"> FINAANCIAL</option>
		<option value="AGRO" > AGRO</option>
		<option value="REGULAR"> REGULAR</option>
	</select><br />
	Email: <input type="text" name="email" /><br/>
	Phone: <input type="text" name="phone" /><br/>
	Address: <textarea rows="5" cols="50" name="address"> </textarea><br/>
	
	<input type="submit" name="submit" />

</form>

<a href="viewAll">View All</a>

</body>
</html>