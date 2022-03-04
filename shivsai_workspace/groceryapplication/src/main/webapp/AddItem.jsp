<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Grocery Application</h1>

	<span> ${message} </span>
	<form action="grocery.do" method="post">
		<div>
			<label for="name">Name</label> <select name="name" id="name">
				<option value="Onion">Onion</option>
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
		<div>
			<label for="quantity">Quantity</label> <select name=""
				quantity"" id=""quantity"">
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">--3--</option>
				<option value="4">--4--</option>
				<option value="5">--5--</option>
				<option value="6">--6--</option>
				<option value="7">--7--</option>
				<option value="8">--8--</option>
				<option value="9">--9--</option>

			</select>
		</div>


		<div>
			<label>Price</label> <input type="price" name="price" />
		</div>


		<div>
			<label for="type">Type</label> <select name="type" id="type">
				<option value="Meat&Fish">Meat&Fish</option>
				<option value="Produce">Produce</option>
				<option value="Grains and Bread">--Grains and Bread--</option>
				<option value="Oil&Fat">--Oil&Fat--</option>
				<option value="Dairy&Eggs">--Dairy&Eggs--</option>
				<option value="Produce">--Produce--</option>
			</select>
		</div>

		<div>
			<label for="brand">Brand</label><select name="brand" id="pincode">
				<option value="Amul">Amul</option>
				<option value="Kissan">--Kissan--</option>
				<option value="MTR">--MTR--</option>
				<option value="Paper boat">--Paper boat--</option>
				<option value="PARLE">--PARLE--</option>
			</select>
		</div>
		<div>
			<input type="submit" name="Add Item">
		</div>
	</form>
	<span style="color: red;"> ${message }</span>
	
	<a href="AddItemResult.jsp">Add another Item</a>
</body>
</html>