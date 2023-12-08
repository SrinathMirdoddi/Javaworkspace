package com.SpringDemo.OAuth.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecurityController {
	
	@GetMapping("/msg")
	public String secure() {
		return "Spring security example code";
		
	}
}
