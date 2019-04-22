<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet"   type = "text/css"  href = "style.css" />
</head>
<body>

<center><h1>Student Admission Form</h1></center>
<form action="/StudentRegistration/submitAdmissionForm" method="post">

<label><b>Username</b></label>
<input type="text" name="studentname" placeholder= "Username" required="required" onfocus="this.value = '';">

<br> <label><b>Password</b></label>
<input type="password" name="password" id="password" placeholder="password" required="required" onfocus="this.value = '';">     

<br><label><b>Mobile Number</b></label>
<input type="text" name="mobile" id="mobile" placeholder= "Mobile Number" required="required" onfocus="this.value = '';">

<br><label><b>E-Mail Address</b></label>
<input type="text" name="email" id="email" placeholder= "E-Mail Address" required="required" onfocus="this.value = '';"> 

<br><label><b>Age</b></label>
<input type="text" name="age" id="age" placeholder= "Age" required="required" onfocus="this.value = '';">    
   
<br><input type="submit" value="Register">   

</form>
</body>
</body>
</html>