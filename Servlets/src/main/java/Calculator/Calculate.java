package Calculator;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.DigestException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class Calculate extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {

			PrintWriter out = response.getWriter();
			
			int a1 = Integer.parseInt(request.getParameter("n1"));
			int a2 = Integer.parseInt(request.getParameter("n2"));

			if (request.getParameter("r1") != null) {
				out.println("<h1>Addition" + (a1 + a2) + "</h1>");
			}

			if (request.getParameter("r2") != null) {
				out.println("<h1>Substraction " + (a1 - a2) + "</h1>");
			}

			if (request.getParameter("r3") != null) {
				out.println("<h1>Multiplication " + (a1 * a2) + "</h1>");
			}

			if (request.getParameter("r1") != null) {
				out.println("<h1>Division " + (a1 / a2) + "</h1>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
