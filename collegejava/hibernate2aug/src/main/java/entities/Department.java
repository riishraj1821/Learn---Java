package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Department")
@Data
@NoArgsConstructor
public class Department {
	@Id
	@Column(name = "did")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "dep_name", unique=true, nullable = false)
	private String depName;
	@Column(name = "location",nullable = false)
	private String location;
	
	public Department(String depName, String location) {
		super();
		this.depName = depName;
		this.location = location;
	}
	
	
}
