package com.SpringDemo.OAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityBasicOAuth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicOAuth2Application.class, args);
	}

}
