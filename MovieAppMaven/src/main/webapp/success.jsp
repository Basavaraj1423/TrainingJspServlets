<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello ...</h1>
	<%
	out.print("Session Id:" +session.getId() + "<br>");
	out.print("MaxInactive:" +session.getMaxInactiveInterval() + "<br>");
	String username = (String) session.getAttribute("username");
	session.setMaxInactiveInterval(5);
	out.println("Welcome " + username + "<br>");
	%>
	<form action="movieServlet">
	<br>
	Select Series to Watch : 
        <select name="series" >
            <option value="got">Game of Thrones</option>
            <option value="BB">Breaking Bad</option>
            <option value="PB">Prison Break</option>
            <option value="Nar">Narcos</option>
            <option value="sc">Sacred Games</option>
            <option value="sg">Squid Games</option>
            <option value="mh">Money Heist</option>
            <option value="mi">Mirzapur</option>
        </select><br>
        <input type="submit" value="Click here to see Characters">
	</form>
	
</body>
</html>