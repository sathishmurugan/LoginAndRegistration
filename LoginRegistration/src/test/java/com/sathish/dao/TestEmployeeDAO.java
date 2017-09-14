package com.sathish.dao;

import com.sathish.model.EmployeeRegistration;

public class TestEmployeeDAO {

	public static void main(String[] args) {
	EmployeeRegistration reg=new EmployeeRegistration();
	reg.setEmployeeName("sathish");
	reg.setEmailId("sathish@sample.com");
	reg.setPassword("welcome");
	EmployeeDAO dao=new EmployeeDAO();
	dao.save(reg);

	}

}
