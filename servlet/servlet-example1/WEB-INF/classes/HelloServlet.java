package com.sn.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

public class HelloServlet implements Servlet {
    public void init(ServletConfig sc) throws ServletException {
        System.out.println("In init");
    }
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("In service");
        PrintWriter out = res.getWriter();
        out.println("Hello... from Servlet");
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

// http://localhost:8080/servlet-example1/sayHello