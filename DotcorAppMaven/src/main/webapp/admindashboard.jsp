<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<style>
body {
	font-family: Arial, sans-serif;
}

.container {
	max-width: 600px;
	margin: 50px auto;
	text-align: center;
}

.dashboard-item {
	display: inline-block;
	margin: 20px;
	padding: 20px;
	background-color: #f0f0f0;
	border-radius: 8px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

.dashboard-item:hover {
	background-color: #e0e0e0;
}

.dashboard-link {
	text-decoration: none;
	color: inherit;
}
</style>
</head>
<body>
	<div class="container">
		<a href="adddoctor.jsp" class="dashboard-link">
			<div class="dashboard-item">Add doctor</div>
		</a> <a href="update_doctor.html" class="dashboard-link">
			<div class="dashboard-item">Update doctor</div>
		</a> <a href="delete_doctor.html" class="dashboard-link">
		
			<div class="dashboard-item">Delete doctor</div>
		</a>
	</div>
</body>
</html>