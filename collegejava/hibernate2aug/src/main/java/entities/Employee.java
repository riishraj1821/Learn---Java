package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emp_info")
@Data
@NoArgsConstructor
public class Employee {
	
	@Id
	@Column(name = "eid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	@Column(name = "name")
	private String name;
	@Column(name = "email", unique = true)
	private String email;
	@Column(name = "salary")
	private Float salary;
	
	@ManyToOne
	@JoinColumn(name="emp_dep")
	private Department dep;

	public Employee(String name, String email, Float salary, Department dep) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.dep = dep;
	}
	
	
}
