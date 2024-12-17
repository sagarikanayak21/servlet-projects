package com.sn.servlet;

import com.sn.dao.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.util.*;
import java.io.*;

@WebServlet(urlPatterns="/login")

public class LoginServlet extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String userName = req.getParameter("username");
        // String passw = "password";
        String passWord = req.getParameter("password");
        System.out.println("PASSWORD 1111111111111: " +passWord);
        UserDAOI dao = new UserDAO();
        boolean flag = dao.findUser(userName,passWord);
        PrintWriter out = res.getWriter();
        if(passWord.length()<5){
            out.println("Invalid User Name");
        } else if(flag){
            out.println("WELCOME..." + userName);
        } else {
            out.println("Invalid User Name / Password");
        }
    } 
}

// http://localhost:8080/servlet-login1/login.html
