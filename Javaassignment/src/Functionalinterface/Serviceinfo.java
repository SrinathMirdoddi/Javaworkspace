package Functionalinterface;

import java.util.function.Supplier;

public class Serviceinfo 
{
	public static void main(String[] args) 
	{
		Supplier<String> sr = () -> {return "sri";};

		System.out.println(sr.get());
		
	}

}
