package Org.hibernate;
import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transaction;

import org.hibernate.Session;

import Hibernatecode.HibernateUtils;

public class Many {
	
	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		Session session = HibernateUtils.getSession();
		t.setName("Sai");
		t.setSalary(30000);
		t.setSubject("physics");
		session.save(t);
		
		Student st = new Student();
		st.setStudname("raj");
		st.setStudrollno(32);
		st.setStudbranch("ECE");
		st.setTeacher(t);
		
		Student st1 = new Student();
		st1.setStudname("ram");
		st1.setStudrollno(56);
		st1.setStudbranch("eee");
		st1.setTeacher(t);
		
		Set<Student> s = new HashSet<Student>();
		s.add(st);
		s.add(st1);
		for(Student a:s)
		{
			session.save(a);
		}
		org.hibernate.Transaction transaction = session.beginTransaction();
        transaction.commit();		
	}
}