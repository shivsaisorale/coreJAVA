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
	<h1>WelCome to Phone Directory</h1>

	<span> ${message} </span>
	<form action="call.do" method="post">
		<div>
			<label>Name</label> <input type="text" name="name" />
		</div>

		<div>
			<label>Moblie No</label> <input type="text" name="mobileNo" />
		</div>
		<div>
			<label for="address">Address</label> />
			<textarea id="address" name="MaillorCross" rows="8" cols="17"></textarea>
		</div>
		<div>
			<label>LandMark</label> <input type="text" name="landmark" />
		</div>
		<div>
			<label>landlineNum</label> <input type="text" name="landline" />
		</div>



		<div>
			<label for="city">city</label> <select name="city" id="city">
				<option value="Bidar">Bidar</option>
				<option value="Kalburgi">Kalburgi</option>
				<option value="Mysore">--Mysore--</option>
				<option value="Gadag">--Gadag--</option>
				<option value="Rayachur">--Rayachur--</option>
				<option value="Mandya">--Mandya--</option>
			</select>
		</div>




		<div>
			<label for="pincode">pincode</label> <select name="pincode"
				id="pincode">
				<option value="585401">585401</option>
				<option value="585101">--585101--</option>
				<option value="570001">--570001--</option>
				<option value="582101">--582101--</option>
				<option value="571401">--571401--</option>
			</select>
		</div>
		<div>
			<input type="submit" name="Add Contact">
		</div>
	</form>
	<span style="color: red;"> ${message }</span>
</body>
</html>
</body>
</html>