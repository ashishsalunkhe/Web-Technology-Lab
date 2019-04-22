<%@ page 
import="java.sql.*"
%>

<%
String user =request.getParameter("user");
String pass =request.getParameter("pass");

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/comp","root","rootpasswordgiven");  
Statement smt  = con.createStatement();  
int i = smt.executeUpdate("insert into account values('"+user+"','"+pass+"')");
if(i>0)
{
%>
	<script> 
		alert('Registered Successfully'); 
		open("index.jsp","_self");
	</script>
<%
}
%>