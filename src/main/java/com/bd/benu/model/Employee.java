package com.bd.benu.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "EID")
	private Integer eid;
	
	@Column(name = "E_NAME")
	private String empName;
	
	@Column(name = "DATE_OF_BIRTH")
	private String empDateOfbirth;
	
	@Column(name = "MOBILE")
	private String empMobileNumber;
	
	@Column(name = "EMAIL")
	private String empEmailId;
	
	@Column(name = "BLOAD_GROUP")
	private String empBloadGroup;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDateOfbirth() {
		return empDateOfbirth;
	}

	public void setEmpDateOfbirth(String empDateOfbirth) {
		this.empDateOfbirth = empDateOfbirth;
	}

	public String getEmpMobileNumber() {
		return empMobileNumber;
	}

	public void setEmpMobileNumber(String empMobileNumber) {
		this.empMobileNumber = empMobileNumber;
	}

	public String getEmpEmailId() {
		return empEmailId;
	}

	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}

	public String getEmpBloadGroup() {
		return empBloadGroup;
	}

	public void setEmpBloadGroup(String empBloadGroup) {
		this.empBloadGroup = empBloadGroup;
	}
	
	

}
