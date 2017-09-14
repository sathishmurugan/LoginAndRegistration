package com.sathish.model;

import com.sathish.model.EmployeeRegistration;

public class TestEmployeeRegistration {

	public static void main(String[] args) {
		EmployeeRegistration emp=new EmployeeRegistration();
		emp.setEmployeeName("sathish");
		emp.setEmailId("sathish@gmail.com");
		emp.setPassword("sathish");
		System.out.println(emp);

	}

}
