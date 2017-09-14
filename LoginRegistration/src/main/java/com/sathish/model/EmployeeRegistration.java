package com.sathish.model;

public class EmployeeRegistration {
	private String employeeName;
	private String emailId;
	private String password;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmployeeRegistration [employeeName=" + employeeName + ", emailId=" + emailId + ", password=" + password
				+ "]";
	}
	
}
