package com.sathish.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	 public static Connection getConnection() throws Exception{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        String url = "jdbc:mysql://localhost:3306/employeedb?useSSL=false";
	        Connection con = DriverManager.getConnection(url,"root" ,"password");
	        return con;
	    }
}
