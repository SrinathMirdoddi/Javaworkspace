package com.SpringDemo.Oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SamplespringsecurityOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamplespringsecurityOauthApplication.class, args);
	}
	@Bean
	public RestTemplate Resttemplate(){
		return new RestTemplate();
		
		
	}

}
