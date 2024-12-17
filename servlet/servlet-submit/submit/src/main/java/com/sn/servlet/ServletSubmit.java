package com.sn.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletSubmit extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.println("Checking.....");
	}

}

// http://localhost:8080/submit/hello
// http://localhost:8080/submit/index.jsp
