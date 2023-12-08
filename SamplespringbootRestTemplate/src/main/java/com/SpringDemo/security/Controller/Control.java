package com.SpringDemo.security.Controller;


import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.SpringDemo.security.Entity.Model;

@RestController
@RequestMapping("/fetch")
public class Control {
	
	@Autowired
	RestTemplate restTemplate;
	
	public Control(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	@GetMapping("/getSave")
	Model[] fetch() {
		//HttpHeaders headers = new org.springframework.http.HttpHeaders()
		return  restTemplate.exchange("http://localhost:8080/Customer/entity", HttpMethod.GET,null,Model[].class).getBody();
		
	}
	
	@PostMapping("/post")
	 Model post(@RequestBody Model model) {
		HttpHeaders header = new HttpHeaders();
		header.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<Model> entity = new HttpEntity<Model>(model,header);
		return restTemplate.exchange("http://localhost:8080/Customer/Post", HttpMethod.POST,entity,Model.class).getBody();	 
	 }
	
	@PutMapping("/update/{custid}")
	String update(@PathVariable int custid, @RequestBody Model model) {
//		HttpHeaders header = new HttpHeaders();
//		header.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//		HttpEntity<Model> entity = new HttpEntity<Model>(model,header);
//		return restTemplate.exchange("http://localhost:8080/Customer/update/Entitys/{id}",HttpMethod.PUT, entity,Model.class).getBody();
		restTemplate.put("http://localhost:8080/Customer/update/Entitys/"+custid,model);
		return "Updated...";	 
	 }    
	
	@DeleteMapping("/delete/{custid}")
	String delete(@PathVariable int custid, @RequestBody Model model) {
		restTemplate.delete("http://localhost:8080/Customer/Delete/Entitys/"+custid, model);
		return "deleted";		
	}

}