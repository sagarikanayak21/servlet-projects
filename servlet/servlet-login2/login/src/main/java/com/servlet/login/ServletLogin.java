package com.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletLogin extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		final String userName = "admin";
		final String passWord = "12345";
		
		String uName = req.getParameter("username");
		String pWord = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		if(userName.equals(uName) && passWord.equals(pWord)) {
			out.println("Login Successful...");
		} else {
			out.println("Invalid UserName or Password");
		}	
	}
}

// http://localhost:8080/login/login.html