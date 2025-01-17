package services;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entities.Employee;

public class EmpService {
	
	public void save(Employee ob)
	{
		Session sess = null;
		try {
			sess = SessFactoryBuilder.getSess();
			sess.save(ob);
			sess.beginTransaction().commit();
			System.out.println("\nEmployee Details Saved");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			sess.close();
		}
	}
	
	public List<Employee> listAll(){
		Session sess = null;
		sess = null;
		try {
			sess = SessFactoryBuilder.getSess();
			
			//SQL, HQL
			Query<Employee> qu=sess.createQuery("from Employee");
			return qu.list();
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			sess.close();
		}
		return null;
	}
	
	public Employee getByID(int id)
	{
		Session sess = null;
		try {
			sess = SessFactoryBuilder.getSess();
			return sess.get(Employee.class,id);
			
			//HQL
			
		}
		
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			sess.close();
		}
		return new Employee();
	}
	public void update(Employee ob)
	{
		Session sess = null;
		try {
			sess = SessFactoryBuilder.getSess();
			sess.update(ob);
			sess.beginTransaction().commit();
			System.out.println("\nEmployee Details Saved");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			sess.close();
		}
	}
}
