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
	<%
		Employee employee = (Employee)request.getAttribute("employee");
		String employeeName = employee.getEmployeeName();
		int employeeId = employee.getEmployeeId();
		double salary = employee.getSalary();
		String city = employee.getCity();
		out.print("Employee Details" + "<br>" +"<hr>");
		out.print("Employee Name : " +employeeName+ "<br>");
		out.print("Employee Id : " +employeeId+ "<br>");
		out.print("Employee Salary : " +salary+ "<br>");
		out.print("Employee City : " +city+ "<br>");
	
	%>

</body>
</html>