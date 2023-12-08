package com.SpringDemo.security.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Model {
	
	@JsonProperty("custid")
	private int  custid;
	@JsonProperty("custname")
	private String custname;
	@JsonProperty("custorder")
	private String  custorder;
	@JsonProperty("custbill")
	private int custbill;
}
