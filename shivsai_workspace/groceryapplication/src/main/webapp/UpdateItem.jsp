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

	
	<form action="update.do" method="post">
		<div>
			<label for="name">Name</label> <select name="name" id="name">
				
				<option value="">-SELECT-</option>
				<option value="Tomato">TomatoCarrot</option>
				<option value="OilyFish">--OilyFish--</option>
				<option value="Soup">--Soup--</option>
				<option value="Salt">--Salt--</option>
				<option value="Honey">--Honey--</option>
				<option value="Vinegr">--Vinegr--</option>
				<option value="Sugar">--Sugar--</option>
				<option value="Milk">--Milk--</option>
				<option value="Eggs">--Eggs--</option>
				<option value="Cheese">--Cheese--</option>
				<option value="juice">--juice--</option>
			</select>
		</div>
		<label>Quantity :</label> ${grocery.quantity} <br>
	<label>Price :</label>${grocery.price} <br>
	<label>Type :</label> ${grocery.type} <br>
	<label>Brand :</label> ${grocery.brand}	<br>	
	<label>Total :</label> ${message1}<br><br>
	<label> </label> ${message}<br><br>

		<div>
			<input type="submit" value="UPDATE">
		</div>
	</form>

</body>
</html>