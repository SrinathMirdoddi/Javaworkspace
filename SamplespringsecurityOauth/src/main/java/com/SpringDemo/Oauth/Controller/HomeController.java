package com.SpringDemo.Oauth.Controller;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.SpringDemo.Oauth.model.Postdata;

@RestController
public class HomeController {
	
	RestTemplate resttemplate;
	
	public HomeController(RestTemplate resttemplate) {
		this.resttemplate = resttemplate;
	}
	
	@GetMapping("/Secure")
	public String token(OAuth2AuthenticationToken token) {
		System.out.println(token.getPrincipal());
		System.out.println(token.getDetails());
		System.out.println(token.getName());
		
		return "OAuth is Succesfully Generated";		
	}
//	@GetMapping("/getting value")
//	Postdata[] getProductList() {
//		HttpHeaders httpheaders = new HttpHeaders();
//		httpheaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<>(httpheaders);
//		return resttemplate.exchange("https://jsonplaceholder.typicode.com/posts",HttpMethod.GET,entity,Postdata[].class).getBody();		
//	}

}
