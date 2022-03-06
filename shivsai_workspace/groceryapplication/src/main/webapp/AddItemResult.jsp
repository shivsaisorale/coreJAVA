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
	<form action="addItemResult.do" method="post">
		<span style="color: red;"> ${message }</span> 
		<a href="AddItem.jsp">Add another Item</a>
			<br> 
		<a href="LandingPage.jsp">Go Home</a>
	</form>


</body>
</html>