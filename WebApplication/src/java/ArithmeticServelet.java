

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArithmeticServelet
 */
@WebServlet("/ArithmeticServelet")
public class ArithmeticServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		String operation=request.getParameter("operation");
		
		int result=0;
		switch(operation) {
		case "Add":
			result=num1+num2;
			break;
		case "Subtraction":
			result=num1-num2;
			break;
		case "Multiplication":
			result=num1*num2;
			break;
		case "Divison":
			if(num2!=0) {
			result=num1/num2;
			}else {
				response.getWriter().println("Error: Divison by Zero");
			}
			break;
		default:
			response.getWriter().println("Invalid operation");

		}
		
		response.getWriter().println("Result: "+result);


	}

}
