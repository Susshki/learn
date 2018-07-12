package com.sushma.JPA2.JPAComponentMapping.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	
	@Column(name="EMPLOYEE_NAME")
	private String name;
	
	@Embedded
	private Address address;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String name, Address address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", address=" + address + "]";
	}
}
