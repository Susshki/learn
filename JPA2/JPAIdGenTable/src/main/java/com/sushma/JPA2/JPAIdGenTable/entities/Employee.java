package com.sushma.JPA2.JPAIdGenTable.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table
public class Employee {
	
	@Id
	@TableGenerator(name="id-gen", table="ID_GEN", pkColumnName="GEN_NAME", valueColumnName="GEN_ID", allocationSize=100)
	@GeneratedValue(strategy=GenerationType.TABLE,  generator="id-gen")
	@Column(name="EMPLOYEE_ID")
	private long empId;
	
	@Column(name="FIRST_NAME")
	private  String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;
	
	@Column(name="EMPOLYMENT_TYPE")
	private  String employmentType;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String emailAddress, String employmentType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.employmentType = employmentType;
	}

	public long getEmpId() {
		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	@Override
	public String toString() {
		return "Empolyee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + ", employmentType=" + employmentType + "]";
	}

}
