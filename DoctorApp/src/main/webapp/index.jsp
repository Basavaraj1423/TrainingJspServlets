<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor App</title>
</head>
<body>
<!-- private Integer docterId;
	private String docterName;
	private String speciality;
	private double fees;
	private int ratings;
	private int experience; -->
	<form action="doctorservlet">
		Docter Id <input type="text" name="doctorId" placeholder="Enter Your Id"> <br> 
		Docter Name <input type="text" name="docterName" placeholder="Enter Your Name"> <br>
		ratings <input type="number" name="ratings" placeholder="Enter Your ratings"> <br> 
		Fees <input type="number" name="fees" placeholder="Enter fee"> <br>
		Experience <input type="number" name="experience" placeholder="Enter experience"> <br>
		
		Select speciality : <select name="speciality">
			<option value="Dermatologiest">Dermatologiest</option>
			<option value="Cardiologiest">Cardiologiest</option>
			<option value="Oncologiest">Oncologiest</option>
			<option value="Arthropodician">Arthropodician</option>
		</select> <br> <input type="submit" value="submit" name="submit">
	</form>

</body>
</html>


















