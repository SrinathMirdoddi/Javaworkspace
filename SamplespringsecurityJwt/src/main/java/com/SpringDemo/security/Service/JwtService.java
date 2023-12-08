package com.SpringDemo.security.Service;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.stereotype.Service;

import com.SpringDemo.security.Repository.JwtRepository;
import com.SpringDemo.security.entity.Entity;

public class JwtService  {
	
	@Service
	public class UserDetails implements UserDetailsService {

	    @Autowired
	    private JwtRepository repository;

	    @Override
	    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        Entity user = repository.findByUserName(username);
	        return new User(user.getUserName(), user.getPassword(), new ArrayList<>());
	    } 
	}
}
