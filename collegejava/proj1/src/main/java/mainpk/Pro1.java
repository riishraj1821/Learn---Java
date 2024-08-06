package mainpk;

import org.hibernate.mapping.List;

import entities.Employee;
import services.EmpService;
import services.SessFactoryBuilder;


public class Pro1 {
 public static void main(String[] args) {
	 
	 EmpService ser = new EmpService();
	 SessFactoryBuilder.buildFactory();
	 
	 Employee e1 = new Employee(103, "rajesh", 22, "rajesh@gmail.com", null);
	 SessFactoryBuilder.buildFactory();
	 ser.save(e1);
	 
	 System.out.println(ser.getByID(1));
	 e1.setAge(10);
	 ser.update(e1);
	 
//	 List<Employee> lst= ser.listAll();
//	 System.out.println(lst);
	 
	 
	 
   SessFactoryBuilder.closeFactory();
	
}
 
}
