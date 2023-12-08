package Org.hibernate1;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.*;

import Hibernatecode.HibernateUtils;

public class Manytomany {
	
	public static void main(String[] args) {
		Customer cust = new Customer();
		Session session = HibernateUtils.getSession();
		cust.setcName("Sri");
		cust.setEmail("sri@123");
		cust.setMobile(638399998);	
		
		
		Customer c1 = new Customer();
		c1.setcName("sai");
		c1.setEmail("sai@113");
		c1.setMobile(728987278);
		
		List<Customer> c = Arrays.asList(cust,c1);
		for (Customer customer : c) {
			
		session.save(customer);
		}
		Items i = new Items();
		i.setItemName("vivo");
		i.setModelname("v1234");
		i.setItemPrice(2300);
		
		Items it = new Items();
		it.setItemName("samsung");
		it.setModelname("6s prime");
		it.setItemPrice(34900);
		
		List<Items> l = Arrays.asList(i,it);
		for (Items items : l) {
			
			session.save(items);
			
		}
		org.hibernate.Transaction transaction=session.beginTransaction();
		transaction.commit();
		
	}
}
			