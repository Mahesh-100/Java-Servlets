

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	      private static final String Valid_User="mahesh";
	      private static final String Valid_Password="mahesh";

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String enteredUser=request.getParameter("user");
		String enteredpassword=request.getParameter("pwd");
//		HttpSession session =request.getSession();
//		session.setAttribute("user", enteredUser);
		Cookie cookie= new Cookie("user",enteredUser);
		response.addCookie(cookie);
		
		if (isValidUser(enteredUser,enteredpassword)) {
			response.sendRedirect("http://localhost:8082/WebApplication/DemoServlet");
		}
		else {
		     
			
			response.sendRedirect("http://localhost:8082/WebApplication/login.html");
			
		
	}

}
	private boolean isValidUser(String user,String password) {
		
		return Valid_User.equals(user)&&Valid_Password.equals(password);
	}

}
      