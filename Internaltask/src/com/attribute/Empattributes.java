package com.attribute;

public class Empattributes {
	
 private int Empid = 121;
 private String Empname = "Srinath";
 private int Empage = 27;
 private String Department = "IT desk";
 
public Empattributes(int empid, String empname, int empage, String department) {
	super();
	Empid = empid;
	Empname = empname;
	Empage = empage;
	Department = department;
	
	
}
public int getEmpid() {
	return Empid;
}
public void setEmpid(int empid) {
	Empid = empid;
}
public String getEmpname() {
	return Empname;
}
public void setEmpname(String empname) {
	Empname = empname;
}
public int getEmpage() {
	return Empage;
}
public void setEmpage(int empage) {
	Empage = empage;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
	
}
}

 
 