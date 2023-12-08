package com.injection.setter;

public class Employee {
	
	private String employeeName;
	private String employeeDepartment;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeDepartment=" + employeeDepartment + "]";
	}	

}
