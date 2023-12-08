package com.attribute;

public class AgenotwithinrangeException extends Exception{
	/**
	     * 
	     */
	 private static final long serialVersionUID = 1L;
	
	  AgenotwithinrangeException(){
	super("Age is not with in range");
    }
	AgenotwithinrangeException(String Message){
    super(Message);
	}
}

	

		       
