<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.empapp.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Employee employee = (Employee) request.getAttribute("employee");
	out.print("Welcome" + employee.getEmployeename() + "<br>");
	out.print("City : " + employee.getCity() + "<br>");
	out.print("EmpId : " + employee.getEmployeeId() + "<br>");
	out.print("Salary : " + employee.getSalary() + "<br>");
	out.print("Courses : " + employee.getCourse() + "<br>");
	%>
</body>
</html>