<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.empapp.service.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome ${employee.employeeName }
	<br> Employee Id ${employee.employeeId }
	<br> City ${employee.city }
	<br> Salary ${employee.salary }
	<br>${message }<br>
	<br>${message1 }<br>
	<br>${sessionScope.message1 }<br>
</body>
</html>