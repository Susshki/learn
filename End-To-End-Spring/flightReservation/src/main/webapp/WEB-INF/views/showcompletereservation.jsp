<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Complete Reservation</h1>

<form action="reservation" method="post">
	<h2>Flight Details:</h2>
	Flight Id:  ${flight.id}
	Airlines : ${flight.airlines}
	Departure City:${departureCity}
	Arrival City:${arrivalCity}
	Date Of Departure:${dateOfDeparture}
	Time Of Departure:${timeOfDeparture}
	
	
	<h2>Passenger Details:</h2>
	FirstName:<input type="text" name="firstName"/>
	LastName:<input type="text" name="lastName"/>
	MiddleName::<input type="text" name="middleName"/>
	Email: <input type="text" name="email"/>
	Phone:<input type="text" name="phone"/>
	<input type="hidden" name="flightId" value="${flight.id}" />
	<input type="submit" value="Submit" />
</form>

</body>
</html>