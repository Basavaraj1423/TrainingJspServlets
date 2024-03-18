<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here,EA</title>
</head>
<body>
	<form action="employeeServlet">
		Employee Name <input type="text" name="employeename"
			placeholder="Enter Your Name"> <br> Employee Id <input
			type="text" name="employeeId" placeholder="Enter Your Id"> <br>
		Salary <input type="text" name="salary"
			placeholder="Enter Your salary"> <br> City <input
			type="text" name="city" placeholder="Enter Your city"> <br>
		Select Courses : <select name="courses">
			<option value="Java">Java</option>
			<option value="Spring">Spring</option>
			<option value="Angular">Angular</option>
			<option value="Jsp">JSP</option>
		</select> <br> <input type="submit" value="submit" name="submit">
	</form>
</body>
</html>