<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
</head>
<body>
	<form action="validate" method="post">
		<input name="user" type="text" placeholder="Username" required> <br>
		<input name="pass" type="password" placeholder="Password" required> <br>
		<input type="submit" value="LOGIN">
	</form>
</body>
</html>