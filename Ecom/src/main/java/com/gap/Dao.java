package com.gap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Dao {
	
	String url = "jdbc:mysql://localhost:3306/GAP";
	
	Connection connection = null;
	
	
	public void connect() {
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection(url,"root","iforgot1234567$");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public boolean check(String uname, String password) {
		
		
		String query = "select * from customer where username = ? and password = ?";
		
		try {
			
			connect();
			
			
			PreparedStatement st = connection.prepareStatement(query);
			
			st.setString(1, uname);
			st.setString(2, password);
			
			ResultSet rs = st.executeQuery();
		
			
			if(rs.next()) {
				
				System.out.println("Has Result");
				
				return true;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Test " + e.getMessage());
			
		}
		
		
		return false;
	}
	
	
	
	public boolean checkUsername(String username) {
		
		String query = "select * from customer where username = ?";
		
		
		try {
			
			
			connect();
			
			PreparedStatement st = connection.prepareStatement(query);
			
			
			st.setString(1,username);
			
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
	
	
	public boolean register(String username, String password, String fullname, String email, String phone, String address) {
		
		
		String query = "insert into customer values(?, ?, ?, ? , ? ,?)";
		
	
		
		try {
			
			connect();
			
			PreparedStatement st = connection.prepareStatement(query);
			
			st.setString(1, username);
			st.setString(2, password);
			st.setString(3, fullname);
			st.setString(4, email);
			st.setString(5, phone);
			st.setString(6, address);
			
			
			int count = st.executeUpdate();
			
			if(count > 0) {
				return true;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}
	
	
	
	public ResultSet getDetails(String type) {
		
		ResultSet resultSet = null;
		
		
		String query = "select * from product";
		
		if(!type.equals("all")) {
			
			query +=  " where producttype = '" + type + "'";
			
		}
		
		try {
			
			connect();
			
			Statement st = connection.createStatement();
			
			
			resultSet = st.executeQuery(query);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		return resultSet;
		
	}
	
	
	

}
