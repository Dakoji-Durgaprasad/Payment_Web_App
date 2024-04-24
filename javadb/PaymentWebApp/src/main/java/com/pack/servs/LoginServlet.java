package com.pack.servs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
    public LoginServlet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(userName);
		System.out.println(password);
		
		String name = "dp";
		String pswd = "pass";
		
		if( name == userName && pswd == password ) {
			String res = "<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>Dash Board</title>\r\n"
					+ "<link rel=\"stylesheet\" href=\"style.css\">\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "	<div class=\"title\">\r\n"
					+ "		<h1>Welcome To The Payments Application</h1>\r\n"
					+ "	</div>\r\n"
					+ "	<div class=\"container options\">\r\n"
					+ "		<div class=\"row\">\r\n"
					+ "			<div class=\"col\">\r\n"
					+ "				<h3><a href=\"http://localhost:8080/PaymentWebApp/primaryacct.html\">PRIMARY ACCOUNT AND BALANCE</a></h3>\r\n"
					+ "				<h3><a href=\"#\">LIST OF BANK ACCOUNTS</a></h3>\r\n"
					+ "				<h3><a href=\"#\">REQUEST FOR STATEMENT</a></h3>\r\n"
					+ "			</div>\r\n"
					+ "			<div class=\"col\">\r\n"
					+ "				<h3><a href=\"#\">WALLET BALANCE</a></h3>\r\n"
					+ "				<h3><a href=\"#\">SEND MONEY</a></h3>\r\n"
					+ "				<h3><a href=\"http://localhost:8080/PaymentWebApp/index.html\">LOG OUT</a></h3>\r\n"
					+ "			</div>\r\n"
					+ "		</div>\r\n"
					+ "	</div>\r\n"
					+ "</body>\r\n"
					+ "</html>";
			
			response.getWriter().write(res);
		}
		else {
			response.getWriter().write("Enter valid username and password");
		}
	}

}
