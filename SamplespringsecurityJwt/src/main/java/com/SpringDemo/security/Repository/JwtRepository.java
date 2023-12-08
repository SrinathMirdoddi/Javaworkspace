package com.SpringDemo.security.Repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.SpringDemo.security.Utility.JwtUtilities;
import com.SpringDemo.security.entity.Entity;
@Component
public interface JwtRepository extends JpaRepository<JwtUtilities,Integer> {
	
	Entity findByUserName(String username);

}
