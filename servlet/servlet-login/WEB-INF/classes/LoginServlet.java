package com.sn.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet implements Servlet {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "pass123";
    public void init(ServletConfig sc) throws ServletException {
        System.out.println("In init");
    }
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        System.out.println("1111111111 username:" + username);
        System.out.println("22222222222 passsword:" + password);

        if(USERNAME.equals(username) && PASSWORD.equals(password)) {
            out.println("<h2>Welcome, " + username + "!</h2>");
        } else {
            out.println("<p style='color:red;'>Invalid username or password. Please try again.</p>");
            out.println("<a href='login.html'>Go back to Login</a>");
        }
    }
    public void destroy(){
        System.out.println("In destroy");
    }
    public String getServletInfo(){
        return null;
    }
    public ServletConfig getServletConfig(){
        return null;
    }
}

// http://localhost:8080/servlet-login/login.html