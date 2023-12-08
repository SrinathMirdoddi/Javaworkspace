package com.motivity.test;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.motivity.student.Student;

import Hibernatecode.HibernateUtils;

public class Studenttest {

	public void saveStudent() {
				
   Student s = new Student();
     s.setSid(100);
     s.setSname("srihas");
     s.setRollno(67); 
     
    Student s1 = new Student();
     s1.setSid(110);
     s1.setSname("jone");
     s1.setRollno(15);
     
    Student s2 = new Student();
     s2.setSid(171);
     s2.setSname("james");
     s2.setRollno(02);
     
     
     Session session =  HibernateUtils.getSession();     
    // session.save(s);
    // session.save(s1);
    // session.delete(s2);
    // session.merge(s1);
     session.merge(s2);
     
//     Student s3 = (Student)session.get(Student.class, 110);
//     System.out.println(s3);
     
     org.hibernate.Transaction transaction = session.beginTransaction();
     transaction.commit();
     
     
    	//	Update Section
		
//  Session session = HibernateUtils.getSession();
//		
//		
//		int id = 11;
//		
//	session.beginTransaction();
//		
//		Student s1 = session.get(Student.class, id);
//	
//		s1.setSname("surya");
//		
//   session.getTransaction().commit();
	
//		System.out.println("Done..."); 		
    } 
	public List<Student> getAllStudentdetails()
	{
		List<Student> students = null;
		Session session = HibernateUtils.getSession();
	    students=session.createQuery("from Student").list();
	    org.hibernate.Transaction transaction = session.beginTransaction();
        transaction.commit();
		return students;
		
	}
    public static void main(String[] args) {
    	Studenttest st=new Studenttest();
        st.saveStudent();
        List<Student> aa=st.getAllStudentdetails();
      for(Student i:aa)
      {
          System.out.println(i);
      }
	}    
}