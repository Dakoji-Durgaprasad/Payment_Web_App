package com.pack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PaymentsWebAppDAO {

	public static void storeUserDetails(String urName, String fname, String lname, String email, String phno, String dob, String address, String pswd) throws SQLException{

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payments_web_app", "root",
					"root");
			Statement st = con.createStatement();
			String storeUserDetailsQuery = "insert into User_info(User_Name,First_Name,Last_Name,Email_Id,Phone_Number,Date_Of_Birth,Address,Password) "
					+ "values('" + urName + "','" + fname + "','" + lname + "','" + email + "','" + phno + "','" + address + "','" + pswd + "')";

			int rs = st.executeUpdate(storeUserDetailsQuery);
			System.out.println(rs + "row/s effected.\n");

			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
