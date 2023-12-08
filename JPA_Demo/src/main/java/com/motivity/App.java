package com.motivity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.motivity.model.Employee;
import com.motivity.utility.JPAUtility;

public class App {
	public static void insertEntity() {
		EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Employee employee = new Employee();
		employee.setEid(2);
		employee.setEname("sai");
		employee.setSalary(29000);
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public static void findEntity() {
		EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee = entityManager.find(Employee.class, 1);
		System.out.println("student id :: " + employee.getEid());
		System.out.println("student firstname :: " + employee.getEname());
		System.out.println("student lastname :: " + employee.getSalary());
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public static void updateEntity() {
		EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		Employee employee = entityManager.find(Employee.class,2);
		employee.setEname("sanju");
        //employee.setSalary(20000);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public static void deleteEntity() {

		EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		Employee employee = entityManager.find(Employee.class,1);
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public static void main(String[] args) {
		//insertEntity();
		//findEntity();
		updateEntity();
		//deleteEntity();
	}
}