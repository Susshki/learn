package com.sushma.springboot.webProjJPA1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="USER_NAME")
	private String name;
	
	@Column(name="USER_EMAIL_ADDRESS")
	private String emailAddress;
	
	public User() {
		super();
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public User(String name, String emailAddress) {
		super();
		this.name = name;
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailAddress=" + emailAddress + "]";
	}
}
