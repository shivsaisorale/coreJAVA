<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>
<body>
	<h1>Grocery Application</h1>

	<h2>Added Grocery Below Are details</h2>
	
	
	<form action="addItem.do" method="post">
		
	
	<label>Name :</label> ${grocery.name} <br>
	<label>Quantity :</label> ${grocery.quantity} <br>
	<label>Price :</label>${grocery.price} <br>
	<label>Type :</label> ${grocery.type} <br>
	<label>Brand :</label> ${grocery.brand}	<br>	
	<label>Total :</label> ${messageTotalPrice}<br><br>
		
		<a href="AddItem.jsp">Add another Item</a>
		
		<br>	
	
		<a href="LandingPage.jsp">Go Home</a><br> 
		<span style="color: red;"> ${message }</span> 
		
			
	</form>


</body>
</html>