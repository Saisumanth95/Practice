package com.gap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String repassword = request.getParameter("repass");
		String reemail = request.getParameter("reemail");
		
		
		HttpSession session = request.getSession();
		
		if(!password.equals(repassword)|| !email.equals(reemail)){
			
			
			session.setAttribute("errorRegister", 1);
			
			response.sendRedirect("Register.jsp");
			
			return;
			
			
		}
		
		
		
		
		Dao dao = new Dao();
		
		
		if(dao.checkUsername(username)) {
			
            session.setAttribute("errorUsername", 2);
			
			response.sendRedirect("Register.jsp");
			
			return;
			
			
		}
		
		
		if(dao.register(username, password, fullname, email, phone, address)) {
			
			response.sendRedirect("Login.jsp");
			
		}else {
			
			response.sendRedirect("Register.jsp");
			
		}
		
		
		
	}

}
