package com.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable
{
	public String name;
	public String dateOfBirth;
	public String department;
	public String designation;
	public Double salary;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDate()
	{
		return dateOfBirth;
	}
	public void setDate(String dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public String getDesignation()
	{
		return designation;
	}
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	public Double getSalary()
	{
		return salary;
	}
	public void setSalary(Double salary)
	{
		this.salary = salary;
	}
	public Employee()
	{
		
	}
	public Employee(String name, String dateOfBirth, String department, String designation, double salary)
	{
		super();
		this.name=name;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	public static void main(String[] args) 
	{
		Employee emp = new Employee("Srinath", "22/08/1999", "Software trainee", "Java developer", 23000.98);
		
		try
		{
			FileOutputStream fileOutput = new FileOutputStream("D:\\employeeinfo.txt");
			ObjectOutputStream outputObj = new ObjectOutputStream(fileOutput);
			outputObj.writeObject(emp);
			outputObj.close();
			fileOutput.close();
			System.out.println("Serilazation information saved");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
	