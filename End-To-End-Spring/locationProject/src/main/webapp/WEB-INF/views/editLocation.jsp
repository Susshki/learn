<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="updateLocation" method="post">
	Id: <input type="text" name="id" value=${location.id}/>
	Code:<input type="text" name="id" value=${location.code}/>
	Name:<input type="text" name="id" value=${location.name}/>
	Type :<input type="radio" name="type" value="RURAL" ${location.type =='RURAL'?'checked':''}/>
	<input type="radio" name="type" value="URBAN"  ${location.type =='URBAN'?'checked':''}/>
	
	<input type="submit" value="Submit" />
</form>

</body>
</html>