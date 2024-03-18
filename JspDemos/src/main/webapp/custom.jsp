<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<%request.setAttribute("message", "Great Day"); %>"
<%String mess1 = (String)request.getAttribute("message"); %>
<%=mess1 %>
<h1>Today is ${message }</h1>
<c:set value="mess1"></c:set>
<c:out value="Today is a ${mess1 }"></c:out>

<%List<String> fruits = Arrays.asList("Apple","guava","mango","banana","kiwi"); 
session.setAttribute("fruitsList", fruits);
%>
<h2>Using El</h2>
${fruitsList }<br>


<h2>Using c:forEach</h2>
<c:forEach items="${fruitsList } var="fruits" >
${fruits }<br>
</c:forEach>
</body>
</html>