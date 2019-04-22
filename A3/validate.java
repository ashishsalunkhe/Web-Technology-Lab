
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class validate extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		boolean flag = false;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/comp","root","rootpasswordgiven");
			Statement  stm = con.createStatement();
			ResultSet  res = stm.executeQuery("SELECT * FROM account");
			while(res.next()) {
				String u = res.getString("username");
				String p = res.getString("password");
				if(user.equals(u) && pass.equals(p))
				{
					flag = true;
					break;
				}
			}
			con.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		if (flag == true) 
		{
			RequestDispatcher r = request.getRequestDispatcher("home.jsp");
			r.forward(request, response);
		}
		else 
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('Username/Password Wrong');</script>"+user+pass);
			RequestDispatcher r = request.getRequestDispatcher("index.jsp");
			r.include(request, response);
		}
	}
}