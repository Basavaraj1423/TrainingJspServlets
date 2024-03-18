<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
    <form action="register" method="post">
        Employee Name <input type="text" name="employeename" placeholder="Enter Your Name"><br>
        City <input type="text" name="city" placeholder="Enter Your city"><br>
        Salary <input type = "text" name="salary" placeholder="Enter Your salary"><br>
        Mobile <input type = "text" name="mobile" placeholder="Enter Your mobile number"><br>
        Select Courses : 
        <select name="courses" >
            <option value="Java">Java</option>
            <option value="Spring">Spring</option>
            <option value="Angular">Angular</option>
            <option value="Jsp">Jsp</option>
        </select><br>
        Hobbies :<br>
        <input type="checkbox" name="hobby" value="dance">Dance<br>
        <input type="checkbox" name="hobby" value="music">Music<br>
        <input type="checkbox" name="hobby" value="sports">Sports<br>
        <input type="checkbox" name="hobby" value="reading">Reading<br>
        
        <input type="submit" value="submit" name="submit">
    </form>

</body>
</html>

</body>
</html>