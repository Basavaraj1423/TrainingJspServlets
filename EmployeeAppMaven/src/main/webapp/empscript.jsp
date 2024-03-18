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
<% Employee employee = (Employee)request.getAttribute("employee"); %>
<%= "Employee Details"  %><br> <hr>
<%= "Employee Name : " +employee.getEmployeeName()%><br>
<%= "Employee Id : " +employee.getEmployeeId() %><br>
<%= "Employee City :" +employee.getCity() %><br>
<%= "Employee Salary : " +employee.getSalary() %><br>


</body>
</html>
