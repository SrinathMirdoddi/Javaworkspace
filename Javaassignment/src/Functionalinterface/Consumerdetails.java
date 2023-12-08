package Functionalinterface;

import java.util.function.Consumer;
public abstract class Consumerdetails implements Consumer 


{
	public static void main(String[] args) 
	{
		Consumer<String> ss = (s)-> System.out.println(s);
		ss.accept("Srinath");
		
	}

}
