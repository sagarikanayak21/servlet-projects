package com.sn.submit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class StudentDetailsServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		// Get the form data
		String name = req.getParameter("name");
		String rollNo = req.getParameter("rollNumber");
		String email = req.getParameter("email");
		
	    // Set the response content type
		res.setContentType("text/html");
		
		// Get the print writer object
		PrintWriter out = res.getWriter();
		
		// Output Student Details
		out.println("<html><body>");
		out.println("<h3>Student Details Submitted:</h3>");
		out.println("<p>Name: " +name+ "</p>");
		out.println("<p>Roll Number: " +rollNo+ "</p>");
		out.println("<p>Email: " +email+ "</p>");
		out.println("</body></html>");
	
	}
}

// http://localhost:8080/student-submit/studentForm.html
