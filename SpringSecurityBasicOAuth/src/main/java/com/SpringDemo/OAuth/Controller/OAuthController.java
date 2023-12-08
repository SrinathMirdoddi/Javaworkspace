package com.SpringDemo.OAuth.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class OAuthController {
	
	@GetMapping("getmsg")
	public String greeting() {
		return "Welcome to Security";
		
	}

}
