package varun;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
public class validate extends ActionSupport implements Action 
{	
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	public String FailMsg = "Please Enter Valid Credentials ..."; 
	
	public String execute() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/comp", "root", "rootpasswordgiven");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from account");		
		while(rs.next())
		{
			if(username.equals(rs.getString("username")) && password.equals(rs.getString("password")))
					return "login";	
		}
		return "error";
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}