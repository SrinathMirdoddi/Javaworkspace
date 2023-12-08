package com.SpringDemo.Oauth.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringAuthgitConfig {
	@Bean
	SecurityFilterChain defaultSecurityFilter(HttpSecurity httpRequest) throws Exception{
		httpRequest.authorizeHttpRequests().anyRequest().authenticated().and().oauth2Login();
		return httpRequest.build();	
	}

	@Bean
	public ClientRegistrationRepository clientRepo() {
		ClientRegistration clientRegistration = clientRegistration();		
		return new InMemoryClientRegistrationRepository(clientRegistration);	
	}
	
	private ClientRegistration clientRegistration() {
		// TODO Auto-generated method stub
		return CommonOAuth2Provider.GITHUB.getBuilder("github").clientId("1f814d87647d88b44ea3").clientSecret("7862060ddfbe32d4eeff2a07e0382da866d8e3ec").build();
	}
	
}


