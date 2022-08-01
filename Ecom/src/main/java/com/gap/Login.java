package com.gap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;



public class Login extends HttpServlet {
	
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		Dao dao = new Dao();
		
		
		if(dao.check(uname, pass)) {
			
			// Enter into shopping site.
			
			HttpSession session = request.getSession();
			
			session.setAttribute("username", uname);
			
			response.sendRedirect("Shop.jsp");
			
			
		}else {
			
			response.sendRedirect("Login.jsp");
			
		}
		
		
		
		
		
	}

}
