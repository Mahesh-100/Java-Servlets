

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int result=(int) request.getAttribute("res");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		//out.println("<h2>The result is:</h2>"+result);
	
//		HttpSession session= request.getSession();
//	
//		Object user=session.getAttribute("user");
//	    out.println("<h2>Login successful "+user+"</h2>");
//	    session.removeAttribute("user");
	     String	user="";
		Cookie[] cookie=request.getCookies();
		for( Cookie c:cookie) {
			if(c.getName().equals("user")) {
				user=c.getValue();
			}
			
		}
		out.println("<h2>Login successful "+user+"</h2>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
