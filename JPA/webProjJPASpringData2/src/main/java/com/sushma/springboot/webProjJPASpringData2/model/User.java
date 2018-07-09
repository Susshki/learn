package com.sushma.springboot.webProjJPASpringData2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	@javax.persistence.Id
	@GeneratedValue
	private long Id;
	
	@Column(name ="USER_NAME")
	private String name;
	
	@Column(name ="USER_ADDRESS")
	private String address;
	
	public User() {
		super();
	}
	public User(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public long getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", address=" + address + "]";
	}
		
}
