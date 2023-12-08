package com.SpringBoot.RestApi.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeBean {
	
	private String Ename;
	@Id
	private String EId;
	
	public String getEname() {
		return Ename;
	}
	
	public void setEname(String ename) {
		Ename = ename;
	}
	
	public String getEId() {
		return EId;
	}
	
	public void setEId(String eId) {
		EId = eId;
	}
	

	public EmployeeBean() {
		super();
	}

	public EmployeeBean(String ename, String eId) {
		super();
		Ename = ename;
		EId = eId;
	}

	public static boolean ExistByName(String ename2) {
		// TODO Auto-generated method stub
		return false;
	}
}
