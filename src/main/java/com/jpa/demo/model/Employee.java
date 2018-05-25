package com.jpa.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="emp_tab")
public class Employee {
	@Id
	@Column(name="EMP_ID")
	@GeneratedValue(generator="emp_id")
	@GenericGenerator(name="emp_id",strategy="increment")
	private Long empId;
	@Column(name="EMP_FIRSTNAME")
	private String empFirstName;
	@Column(name="EMP_LASTNAME")
	private String empLastName;
	@Column(name="DESIGNATION")
	private String designation;
	@Column(name="JOIN_DATE")
	@Temporal(TemporalType.DATE)
	private Date joinDate;
	@Column(name="EMP_CODE")
	private String empCode;
	
	public Employee() {
		super();
	}

	public Employee(Long empId, String empFirstName, String empLastName, String designation, Date joinDate,
			String empCode) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.designation = designation;
		this.joinDate = joinDate;
		this.empCode = empCode;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	

}
