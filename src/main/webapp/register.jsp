<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<h1>Registration Form</h1>
	<form method="post" action="/ServletApplication/register.do">
		<p>First Name: <input type="text" name="firstName"/></p>
		<p>Last Name: <input type="text" name="lastName"></p>
		<p>Birth date: <input type="date" name="birthDate"/> </p>
		<p>Email: <input type="email" name="email"></p>
		<p>Years of experience: <input type="number" name="experience" value="1" min="1"></p>
		<p>Programming Languages</p>
		<input type="checkbox" name="programmingLanguages" value="java"/>Java
		<input type="checkbox" name="programmingLanguages" value="c#"/>C#
		<input type="checkbox" name="programmingLanguages" value="php"/>PHP
		<input type="checkbox" name="programmingLanguages" value="python"/>Python
		
		<hr>
		<input type="reset" name="resetBtn" value="Reset">
		<input type="submit" name="submit" value="Submit"> 
	</form>
</body>
</html>