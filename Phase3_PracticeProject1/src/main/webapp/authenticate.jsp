<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentication Page</title>
</head>
<h2>Login Page</h2>
<body>
welcome to the authentication page

<form action="Auth" method="post" >
	<input name="username" type="text" placeholder="Username" /><br>
	<input name="password" type="password" placholder="Password" /><br>
	<input type="submit" value = "login">
</form>
</body>
</html>