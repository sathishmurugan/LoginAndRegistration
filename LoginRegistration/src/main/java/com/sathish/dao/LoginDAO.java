package com.sathish.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sathish.model.EmployeeRegistration;
import com.sathish.util.ConnectionUtil;

public class LoginDAO {
	public boolean validateUser(String userEmail,String userPassword) throws Exception
	{
        String query = "select * from employee where emailid=? ";
         
        Connection connection = ConnectionUtil.getConnection();
         
        PreparedStatement pst = connection.prepareStatement(query);
        pst.setString(1, userEmail);
       
        ResultSet rs = pst.executeQuery();
        String email="";
        String passowrd="";
        while(rs.next())
        {
        	email=rs.getString("emailId");
        	passowrd=rs.getString("password");
        }
        
       if (passowrd.equals(userPassword)) {
    	   return true;
		
	}else
	{
		return false;
	}

       
        
        
        
           }
 
}


