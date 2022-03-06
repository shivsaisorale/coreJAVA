<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grocery Application</title>
</head>
<body>
<h1>Search item<h1>

<form action="search.do">
  <input type="text" name="name"/>
   <input type="submit" value="Search"/>
</form>
<h2>${message}</h2>

<div>
<label>Name</label>:${grocery.name}<br> 
<label> Quantity</label>:${grocery.quantity}<br>
<label> Price</label>:${grocery. price}<br>
<label> Type</label>:${grocery.type}<br>
<label> Brand</label>:${grocery.brand}<br>
<label> Total Price</label>:<input type="text" value="${grocery.price}" name="price" /><br>

</div>
</body>
</html>