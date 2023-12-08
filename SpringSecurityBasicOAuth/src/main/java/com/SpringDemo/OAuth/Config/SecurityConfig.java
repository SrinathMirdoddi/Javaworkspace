package com.SpringDemo.OAuth.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration {
	
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication()
		.withUser("JavaTechie").password("Auth22")
		.roles("Admin");
	}
	


	
	
}

