package com.motivity.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	
	public static EntityManagerFactory getEntityManagerFactory() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
		return factory;
	}
}