package com.motivity.Reflection;

import java.lang.reflect.Method;

public class APIReflection 
{
	public static void main(String[] args) 
	{
		try
		{
			Class c = Class.forName("com.motivity.Reflection.APIReflection");
			APIReflection api = (APIReflection)c.newInstance();
	        Method m = c.getDeclaredMethod("show", null);
	        m.setAccessible(true);
	        m.invoke(api, null);
	        System.out.println("Retrieve data");
	        }
	        catch(Exception e)
	        {
	            System.out.println("Retrieve data");
	        }
		}
}
