package groupBy;

import java.util.List;

import javax.transaction.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.annotations.OrderBy;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.mysql.cj.x.protobuf.MysqlxCrud.Projection;

import Hibernatecode.HibernateUtils;

public class mainGroup {
	
	static Session session = null;
	
	public static void main(String[] args) {
		
		session = HibernateUtils.getSession();
		Students st = new Students();
		st.setAge(21);
		st.setName("ram");
		st.setCourse("eee");
		
		Students st1 = new Students();
		st1.setAge(28);
		st1.setName("rake");
		st1.setCourse("ece");
		
		Students st2 = new Students();
		st2.setAge(20);
		st2.setName("raj");
		st2.setCourse("mech");
		session.save(st);
		session.save(st1);
		session.save(st2);
		
		//someGroupby();
		//orderBylessthan();

		//orderBygreaterthan();
		//orderBybetween();
		//orderByasc();
		orderBydesc();
		
		org.hibernate.Transaction t = session.beginTransaction();
		t.commit();
		
				
		
	}
	public static void someGroupby()
	{
		session=HibernateUtils.getSession();
		Criteria crt = session.createCriteria(Students.class);
		Object val = crt.setProjection(Projections.min("age")).uniqueResult();
		Object val1 = crt.setProjection(Projections.max("age")).uniqueResult();	
		Object v = crt.setProjection(Projections.avg("age")).uniqueResult();
		Object v1 = crt.setProjection(Projections.countDistinct("age")).uniqueResult();
		System.out.println(v.toString());
		System.out.println(val.toString());	
		System.out.println(val1.toString());
		System.out.println(v1.toString());
		
	}
	public static void orderBylessthan()
	{
		session=HibernateUtils.getSession();
		Criteria ct = session.createCriteria(Students.class);
		List<Students> li = ct.add(Restrictions.lt("age", 28)).list();
		for (Students students : li) {
			System.out.println(students.toString());
		}	
	}
	public static void orderBygreaterthan()
	{
		session=HibernateUtils.getSession();
		Criteria cr = session.createCriteria(Students.class);
		List<Students> lst = cr.add(Restrictions.gt("age", 20)).list();
		for (Students students : lst) {
			System.out.println(students.toString());
		}		
	}
	public static void orderBybetween()
	{
		session=HibernateUtils.getSession();
		Criteria cr = session.createCriteria(Students.class);
		List<Students> lst1= cr.add(Restrictions.between("age",20,28)).list();
		for (Students students : lst1) {
			System.out.println(students.toString());
		}		
	}
	public static void orderByasc()
	{
		session=HibernateUtils.getSession();
		Criteria cri = session.createCriteria(Students.class);
		List<Students> ls1 = cri.addOrder(Order.asc("age")).list();
		for (Students students : ls1) {
			System.out.println(students);
		}		
	}
	public static void orderBydesc()
	{
		session=HibernateUtils.getSession();
		Criteria ca = session.createCriteria(Students.class);
		List<Students> l2 = ca.addOrder(Order.desc("age")).list();
		for (Students students : l2) {
			System.out.println(students);
		}			
	}
}
