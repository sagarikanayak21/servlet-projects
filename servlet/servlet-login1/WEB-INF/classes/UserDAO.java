package com.sn.dao;

public class UserDAO implements UserDAOI{
    public boolean findUser(String userName, String passWord){
        // here we will connect with DB
        return passWord.equals("12345");
    }
}
