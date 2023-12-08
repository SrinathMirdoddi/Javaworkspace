package com.SpringDemo.Oauth.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Postdata {
	@JsonProperty("id")
	int id;
	@JsonProperty("userid")
	int userId;
	@JsonProperty("title")
	String title;
	@JsonProperty("body")
	String body;
	

}
