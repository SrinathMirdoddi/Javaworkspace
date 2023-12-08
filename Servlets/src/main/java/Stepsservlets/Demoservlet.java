package Stepsservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demoservlet implements Servlet{
	
	private ServletConfig config;
	public void init(ServletConfig config){
		this.config=config;
		System.out.println("servlet is initialized");
		}

		public void service(ServletRequest req,ServletResponse res)
		throws IOException,ServletException{

		res.setContentType("text/html");

		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello simple servlet</b>");
		out.print("</body></html>");

		}
		public void destroy(){System.out.println("servlet is destroyed");}
		public ServletConfig getServletConfig(){return config;}
		public String getServletInfo(){return "cleared";}
}

//steps for creating servlet program
//Create a directory structure
//Create a Servlet
//Compile the Servlet
//Create a deployment descriptor
//Start the server and deploy the project
//Access the servlet
