<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
	out.print("Session Id:" +session.getId() + "<br>");
	out.print("MaxInactive:" +session.getMaxInactiveInterval() + "<br>");
	String username = (String) session.getAttribute("username");
	out.println("Welcome " + username + "<br>");
	
	
	List<String> characters = (List<String>)request.getAttribute("details");
	out.println("The Main Characters in the Series" + "<br> " +"<hr>");
	for(String character : characters){
		out.println(character + "<br> ");
	}
	
	

	
	
	
	%>

</body>
</html>