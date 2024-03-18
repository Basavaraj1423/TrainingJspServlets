<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Doctor</title>
<style>
body {
	font-family: Arial, sans-serif;
}

.container {
	max-width: 400px;
	margin: 50px auto;
}

.form-group {
	margin-bottom: 20px;
}

label {
	display: block;
	font-weight: bold;
}

input[type="text"], select {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-sizing: border-box;
}

input[type="number"] {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-sizing: border-box;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Add Doctor</h2>
		<form action="addServlet" method="post">
			<div class="form-group">
				<label for="doctorName">Doctor Name:</label> <input type="text"
					id="doctorName" name="doctorName" required>
			</div>
			<div class="form-group">
				<label for="speciality">Speciality:</label> <select id="speciality"
					name="speciality" required>
					<option value="">Select Speciality</option>
					<option value="CARDIOLOGY">Cardiology</option>
					<option value="NEUROLOGY">Neurology</option>
					<option value="PEDIATRICIAN">Pediatrician</option>
					<option value="UROLOGY">Urology</option>
				</select>
			</div>
			<div class="form-group">
				<label for="fees">Fees:</label> <input type="number" id="fees"
					name="fees" required>
			</div>
			<div class="form-group">
				<label for="ratings">Ratings:</label> <input type="number"
					id="ratings" name="ratings" step="0.1" min="0" max="5" required>
			</div>
			<div class="form-group">
				<label for="experience">Experience:</label> <input type="number"
					id="experience" name="experience" required>
			</div>
			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>