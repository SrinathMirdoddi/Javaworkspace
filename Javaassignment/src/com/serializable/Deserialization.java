package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Employee empobj = null;
		try
		{
			FileInputStream fileInput = new FileInputStream("D:\\employeeinfo.txt");
			ObjectInputStream inputObj = new ObjectInputStream(fileInput);
			empobj = (Employee)inputObj.readObject();
			inputObj.close();
			fileInput.close();
			System.out.println("Deserialization of information");
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
		
	}

}
