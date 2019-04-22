package varun;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;
public class register extends ActionSupport
{	
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	public String execute()  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/comp", "root", "rootpasswordgiven");
		Statement st = con.createStatement();
		int id = st.executeUpdate("insert into account values('"+username+"','"+password+"')");
		
		if(id>0)
			return "success";		
		else
			return "failure";
	}	
	public String getUsername() {	return username;}
	public void setUsername(String username) {this.username = username;}
	public String getPassword() {	return password;	}
	public void setPassword(String password) {this.password = password;}
	
}