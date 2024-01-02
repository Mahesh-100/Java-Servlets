

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/WishServlet")
public class WishServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		LocalDateTime hour= LocalDateTime.now();
		int hourOfDay=hour.getHour();
		if(hourOfDay<12) {
			out.println("Good Morining");
		}else if(hourOfDay<16) {
			out.println("Good Afternoon");
		}else if(hourOfDay<20) {
			out.println("Good Evening");
		}else  {
			out.println("Good Night");
		}
		out.println("<br><br> <a href='http://localhost:8082/WebApplication/greet.html'>Home</a>");
	}

}
