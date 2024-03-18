<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="errorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP</h1>
	<%
	String name = "Raja";
	%>
	<%="Welcome " + name%>

	<%
	int x = 10, y = 20;
	%>
	<%="Sum " + (x + y)%><br>

	<%!int counter = 0;%>
	You are Visitor no :
	<%=++counter%><br>
	<%!String greet() {
	return "Welcome back";
}%>
	<%=greet()%>
	<%
	int a = 10 / 0;
	%>

</body>
</html>