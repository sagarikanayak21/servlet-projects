package com.sn.servlet;

import javax.servlet.*;
import java.io.*;

import com.sn.vo.Student;
import com.sn.student.dao.StudentDAO;
import com.sn.student.dao.StudentDAOI;

public class ServletStudentDemo implements Servlet{
    public void init(ServletConfig sc) throws ServletException {
        System.out.println("In init");
    }
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        StudentDAOI sdao = new StudentDAO();
        Student s = sdao.getStudentById("USBM007");
        PrintWriter out = res.getWriter();
        out.println("sid: " + s.getSid() + "First Name: " + s.getFName() + "Last Name: " + s.getLName());
    }
    public void destroy(){
        System.out.println("In destory");
    }
    public String getServletInfo(){
        return null;
    }
    public ServletConfig getServletConfig(){
        return null;
    }
}

// http://localhost:8080/servlet-student/sayHello