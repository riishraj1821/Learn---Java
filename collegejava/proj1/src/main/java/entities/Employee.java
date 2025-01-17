package entities;

import org.hibernate.annotations.JoinColumnOrFormula;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor

@Table(name ="empinfo")

public class Employee {
	
@Id
@Column(name="emp_id")
private   Integer id;

@Column(name = "emp_name", nullable= false)
 private String name;
@Column(name = "age", nullable = false)
private  Integer age;
@Column(name = "Email", nullable = false, unique = true)
private String email;
@Column(name = "salary", nullable = true)
 private Float salary;
}
