<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<s:form action="Register" method="post">
	<s:textfield label="Username " key="username" required="true" />
	<s:password label="Password " key="password" required="true" />
	<s:submit label="Register" />
	<s:actionerror />
</s:form>
</body>
</html>