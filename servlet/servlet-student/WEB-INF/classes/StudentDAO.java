package com.sn.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sn.vo.Student;

public class StudentDAO implements StudentDAOI{
    public Student getStudentById(String sid){
        try{
            String sql = "SELECT * FROM student WHERE sid = '" + sid + "'";
            // "SELECT * FROM student WHERE studentId = '" + studentId + "'"; 
            System.out.println("SQL11111111111:    " +sql);
            // Obtain the connectionpps
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "sys as sysdba", "admin");

            // Get the JDBC statement
            Statement st = con.createStatement();

            // Execute the statement
            ResultSet rs = st.executeQuery(sql);
            Student s = new Student();
            while (rs.next()) {
                s.setSid(rs.getString(1));
                s.setFName(rs.getString(2));
                s.setLName(rs.getString(3));
                s.setCourse(rs.getString(4));
                s.setGender(rs.getString(5));
                s.setDept(rs.getString(6));
                s.setAddress(rs.getString(7));
            }
            return s;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception Occured");
        }
        return null;
    }
    
}
