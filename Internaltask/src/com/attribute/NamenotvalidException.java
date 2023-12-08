package com.attribute;

public class NamenotvalidException extends Exception {
	 /**
	     * 
	     */
	 private static final long serialVersionUID = 1L;
	NamenotvalidException(){
	super("Name is not valid");
	 }
	
	NamenotvalidException(String Message){
	 super(message);
	        }
}

