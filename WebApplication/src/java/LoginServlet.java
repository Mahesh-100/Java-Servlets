

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String Valid_userName="mahesh";
	private static final String Valid_password="mahesh";

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
		String enteredName=request.getParameter("user");
		String enteredPassword=request.getParameter("user");
		HttpSession session =request.getSession();
		session.setAttribute("user", enteredUser);
		
		if(isValidUser(enteredName,enteredPassword)) {
			response.sendRedirect("http://localhost:8082/WebApplication/ValidServlet");
			
		}else {
			response.sendRedirect("http://localhost:8082/WebApplication/login.html");
		}
		
			
	}
	private boolean isValidUser( String username,String password) {
		return Valid_userName.equals(username)&& Valid_password.equals(password);
		
	}
	

}
