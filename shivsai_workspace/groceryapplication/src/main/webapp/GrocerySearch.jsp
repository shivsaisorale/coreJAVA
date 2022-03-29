<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grocery Application</title>
</head>
<body>
	<h1>Search item</h1>

	<form action="search.do" method="post">
		<input type="text" value="name" /> <input type="submit" value="search" />

		<div>
			<label>Name :</label>${grocery.name}<br> 
			<label> Quantity :</label>${grocery.quantity}<br>
			<label> Price :</label>${grocery. price}<br> 
			<label> Type :</label>${grocery.type}<br>
			<label> Brand :</label>${grocery.brand}<br> 
			
</div>
			<a href="LandingPage.jsp"> HOME PAGE </a>

		
	</form>
	<span>${grocery}</span>
</body>
</html>