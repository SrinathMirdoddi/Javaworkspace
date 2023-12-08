package userlogin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Details")
public class Details extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
//		String fname =req.getParameter("fn");
//		String Lname = req.getParameter("ln");
//		String mobile =req.getParameter("mb");
		String emailid = req.getParameter("email");
		String password = req.getParameter("pswd");
		String url ="jdbc:mysql://localhost:3306?user=root&password=sql22";
		String query ="select * from motivitylabs.registration where emailid=? and password=? ";
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url);
			System.out.println("connected");
			PreparedStatement ps = connect.prepareStatement(query);
			ps.setString(1, emailid);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				RequestDispatcher re = req.getRequestDispatcher("employee.html");
				re.include(req, resp);
			//	resp.sendRedirect("employee.html");
			}
			else
			{
				resp.sendRedirect("NewLogin.jsp");
			}
			connect.close();
		} 
		catch (SQLException | ClassNotFoundException  e)
		{
			e.printStackTrace();
		}
	}
}
