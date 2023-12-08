package com.SpringDemo.security.entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@javax.persistence.Entity
@Table(name = "USER_TBL")

public class Entity {
	
	    @Id
	    private int id;
	    private String userName;
	    private String password;
	    private String email;

}
