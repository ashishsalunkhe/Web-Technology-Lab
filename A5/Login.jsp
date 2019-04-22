<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<s:form action="Login" method="post">
	<s:textfield name="username" label="Username" />
	<s:password  name="password" label="Password" />
	<s:submit label="Login" />
	<s:actionerror />
</s:form>

</body>
</html>