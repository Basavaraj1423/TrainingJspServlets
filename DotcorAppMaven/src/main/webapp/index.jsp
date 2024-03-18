<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor App</title>
<style>
body {
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	background-color: #f0f0f0;
}

.container {
	text-align: center;
}

input[type="text"] {
	padding: 10px;
	border: radius 5px;
	border: 1px solid #ccc;
	margin-right: 10px;
}

button {
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	background-color: #007bff;
	color: white;
	cursor: pointer;
}

.admin-link {
	display: block;
	margin-top: 10px;
	text-decoration: none;
	color: #007bff;
}

button:hover, .admin-link:hover {
	background-color: #0056b3;
}

@media ( max-width : 600px) {
	input[type="text"] {
		width: 70%;
	}
}
</style>
</head>
<body>
	<div class="container">
		<form action="">
			<input type="text" id="search" name="search" placeholder="Search...">
			<button type="submit">Search</button>
		</form>
		<a href="login.jsp" class="admin-link" target="_blank"> Admin</a>
	</div>

</body>
</html>