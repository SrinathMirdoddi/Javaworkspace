package javax.persistience;

import javax.transaction.Transaction;

import org.hibernate.Session;

import Hibernatecode.HibernateUtils;

public class Mainclass {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtils.getSession();
		Customer c = new Customer();
		c.setcName("Srinath");
		c.setEmail("sri76@gmail.com");
		c.setMobile(984809131);
		session.save(c);
		
		Wallet w = new Wallet();
		w.setAmount(7000);
		w.setCustomer(c);
		
		session.save(w);
	org.hibernate.Transaction transaction = session.beginTransaction();
	          transaction.commit();
			
	}

}
