<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
	<h2>User Details</h2>

	<%
	String employeename = (String) request.getAttribute("employeeName");
	String city = (String) request.getAttribute("city");
	double salary = (Double) request.getAttribute("salary");
	String course = (String) request.getAttribute("course");
	Long mobile = (Long) request.getAttribute("mobile");
	String[] hobbies = (String[]) request.getParameterValues("hobby");

	out.println("Name:" + employeename + "<br>");
	out.println("City:" + city + "<br>");
	out.println("Salary:" + salary + "<br>");
	out.println("Selected courses:" + course + "<br>");
	out.println("Mobile:" + mobile + "<br>");
	for (String hobbys : hobbies) {
		out.print("hobby :" + hobbys.toUpperCase() + "<br>");
	}
	%>

</body>
</html>