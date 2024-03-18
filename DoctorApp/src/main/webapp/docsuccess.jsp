<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.doctorapp.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--private Integer docterId;
	private String docterName;
	private String speciality;
	private double fees;
	private int ratings;
	private int experience;  -->

<%
	Doctor doctor = (Doctor) request.getAttribute("doctor");
	out.print("welcome Doctor " +doctor.getDocterName() + "<br>");
	out.print("Doctor Id " +doctor.getDocterId() + "<br>");
	out.print("Doctor Speciality " +doctor.getSpeciality() + "<br>");
	out.print("Doctor fees " +doctor.getFees() + "<br>");
	out.print("Doctor ratings " +doctor.getRatings() + "<br>");
	out.print("Doctor experience " +doctor.getExperience() + "<br>");
	%>

</body>
</html>