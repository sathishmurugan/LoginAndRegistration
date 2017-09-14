package com.sathish.dao;

import java.util.List;

import com.sathish.model.EmployeeRegistration;

public class TestLoginDAO {

	public static void main(String[] args) {
EmployeeRegistration emp=new EmployeeRegistration();
emp.setEmailId("sathish@sample.com");
emp.setPassword("welcome");
LoginDAO dao=new LoginDAO();
try {
	Boolean result=dao.validateUser(emp.getEmailId(), emp.getPassword());
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
