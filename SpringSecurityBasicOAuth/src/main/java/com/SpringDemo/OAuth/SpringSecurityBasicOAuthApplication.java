package com.SpringDemo.OAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityBasicOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicOAuthApplication.class, args);
	}
}
