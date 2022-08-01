package com.gap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	
	
	String url = "jdbc:mysql://localhost:3306/GAP";
	String query = "select * from login where uname = ? and pass = ?";
	
	public boolean check(String uname, String password) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url,"root","iforgot1234567$");
			
			PreparedStatement st = conn.prepareStatement(query);
			
			st.setString(1, uname);
			st.setString(2, password);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
	

}
