package com.sn.vo;

public class Student {
    private String sid;
    private String fName, lName, course, gender, dept, address;

    public void setSid(String sid){
        this.sid = sid;
    }
    public String getSid(){
        return sid;
    }
    public void setFName(String fName){
        this.fName = fName;
    }
    public String getFName(){
        return fName;
    }
    public void setLName(String lName){
        this.lName = lName;
    }
    public String getLName(){
        return lName;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public String getDept(){
        return dept;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
}