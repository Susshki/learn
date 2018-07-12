package com.sushma.JPA2.JPAOneToMany.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	//mappedBy - who is the owner of the foreign key
	@OneToMany(mappedBy="person",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<Phone> phoneNums;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Phone> getPhoneNums() {
		return phoneNums;
	}

	public void setPhoneNums(Set<Phone> phoneNums) {
		this.phoneNums = phoneNums;
	}
	
	public void addPhoneNum(Phone phoneNum) {
	
		if(phoneNum != null) {
			if(phoneNums ==null) {
				phoneNums = new HashSet<Phone>();
			}
			phoneNums.add(phoneNum);
			phoneNum.setPerson(this);
		}		
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phoneNums=" + phoneNums + "]";
	}
	
}
