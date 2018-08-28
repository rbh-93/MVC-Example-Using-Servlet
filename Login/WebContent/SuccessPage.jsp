<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import = "mvc.example.User"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<h3>Login Successful!</h3>
	
	
	<jsp:useBean id="user" class="mvc.example.User" scope="request"></jsp:useBean>

	Hello
	<jsp:getProperty property="userName" name="user"/>!

</body>
</html>