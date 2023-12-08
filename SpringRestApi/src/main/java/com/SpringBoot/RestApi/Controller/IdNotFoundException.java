package com.SpringBoot.RestApi.Controller;

public class IdNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public IdNotFoundException(String msg) {
		System.out.println(msg);
		
	}

}
