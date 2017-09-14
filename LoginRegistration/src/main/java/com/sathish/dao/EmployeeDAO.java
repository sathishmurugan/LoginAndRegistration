package com.sathish.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sathish.model.EmployeeRegistration;
import com.sathish.util.ConnectionUtil;
//Data Access Object
public class EmployeeDAO {
public void save(EmployeeRegistration emp)
{
	try {
		// Step 1:Get the connection
		Connection conn=ConnectionUtil.getConnection();
		// Step 2: Query
		String sql = "insert into employee ( employeeName, emailId, password) value ( ?, ? ,? )";
		// 3. Set the input
		PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, emp.getEmployeeName());
        pst.setString(2, emp.getEmailId());
        pst.setString(3, emp.getPassword());
        // 4. Query execute
        int rows = pst.executeUpdate();
        System.out.println("No of rows inserted: " + rows);
        
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
