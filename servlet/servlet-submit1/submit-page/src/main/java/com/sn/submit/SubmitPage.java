package com.sn.submit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SubmitPage extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String fName = req.getParameter("firstname");
		String lName = req.getParameter("lastname");
		String date = req.getParameter("dob");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String className = req.getParameter("className");
		String schoolName = req.getParameter("schoolName");
		
		PrintWriter out = res.getWriter();
		if(fName.length()>1 && lName.length()>1 && null!=date && null!=schoolName) {
			out.println("You are Registerd");
			out.println(fName +" " + lName + " WELCOME TO " + schoolName);
			out.println("Your Details");
			out.println("DOB: " +date);
			out.println("Age: " +age);
			out.println("Gender: " +gender);
			out.println("Class: " +className);
		} else {
			out.println("Invalid Inputs");
		}
	}

}

// http://localhost:8080/submit-page/submit.html