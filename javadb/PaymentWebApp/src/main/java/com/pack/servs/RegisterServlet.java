package com.pack.servs;

import com.pack.dao.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public RegisterServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String fName = request.getParameter("firstname");
		String lName = request.getParameter("lastname");
		String eId = request.getParameter("email");
		String phNo = request.getParameter("phno");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");
		String pswd = request.getParameter("pswd");
		
		PaymentsWebAppDAO dao = new PaymentsWebAppDAO();
		try {
		dao.storeUserDetails(userName, fName, lName, eId, phNo, dob, address, pswd);
		}
		catch ( Exception e) {
			e.printStackTrace();
		}
	}

}
