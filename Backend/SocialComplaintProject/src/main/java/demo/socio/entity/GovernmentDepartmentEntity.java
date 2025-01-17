package demo.socio.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
@Table(name = "government_department_information_tbl")
public class GovernmentDepartmentEntity {

	@Id
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long government_department_id;
	
	private String government_department_name;
	
	
	public GovernmentDepartmentEntity() {
		super();
	}

	public GovernmentDepartmentEntity(long government_department_id, String government_department_name) {
		super();
		this.government_department_id = government_department_id;
		this.government_department_name = government_department_name;
	}

//	----------------------------------------- GETTERS & SETTERS -----------------------------------------
	
	public long getGovernment_department_id() {
		return government_department_id;
	}

	public void setGovernment_department_id(long government_department_id) {
		this.government_department_id = government_department_id;
	}

	public String getGovernment_department_name() {
		return government_department_name;
	}

	public void setGovernment_department_name(String government_department_name) {
		this.government_department_name = government_department_name;
	}




}
