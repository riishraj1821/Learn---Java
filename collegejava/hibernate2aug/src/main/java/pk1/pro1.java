package pk1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Department;

public class pro1 {
	
public static void main(String[] args) {
	Configuration cfg = new Configuration().configure();
	SessionFactory sf = cfg.buildSessionFactory();
	
	Department d1 = new Department("sales", "Indore");
	Department d2 = new Department("Store", "Ujjain");
	Department d3 = new Department("Purchase", "Dewas");
	
	Session sess = sf.openSession();
	
	sess.save(d1);
	sess.save(d2);
	sess.save(d3);
	
	sess.beginTransaction().commit();
	
	sess.close();
	sf.close();
}
}
