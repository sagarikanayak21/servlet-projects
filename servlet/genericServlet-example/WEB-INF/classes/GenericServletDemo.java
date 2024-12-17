package com.sn.generic.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(urlPatterns="/generic") // http://localhost:8080/genericServlet-example/generic?username=abc&&password=123

public class GenericServletDemo extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res){
        try{e
        Enumeration em = req.getParameterNames();
        String userName = req.getParameter("username");
        System.out.println("USERNAME1111111111111:  " +userName);
        String passw = "password";
        String password = req.getParameter(passw);
        System.out.println("PASSWORD222222222222:  " +password);
        PrintWriter out = res.getWriter();
        out.println("Names: " + em + " username: " + userName + " password: " +password);
        System.out.println("In service");
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception Occured");
        }
    }
}