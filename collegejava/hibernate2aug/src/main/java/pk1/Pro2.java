package pk1;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entities.Department;
import entities.Employee;

public class Pro2 {
	
public static void main(String[] args) {
	Configuration cfg = new Configuration().configure();
	SessionFactory sf = cfg.buildSessionFactory();
	
	Session sess =  sf.openSession();
//	
//	Department d1 = sess.get(Department.class, 3);
//	Department d2 = sess.get(Department.class, 2);
//	
//	Employee e1= new Employee("vikas","vikas@gmail.com",2500f, d1);
//	Employee e2= new Employee("ryes","rjes@gmail.com",200f, d2);	
//	sess.save(e1);
//	sess.save(e2);
//	sess.beginTransaction().commit();
	
	Employee e1 = sess.get(Employee.class, 1023);
	System.out.println(e1);
	
	Query<Employee> qu = sess.createQuery("from Employee");
	List<Employee> lst = qu.list();
	for(Employee e: lst)
		System.out.println(e);
	
	sf.close();
}
}
