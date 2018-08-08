package com.sushma.student.dal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sname")
	private String name;
	
	@Column(name="scourse")
	private String scourse;
	
	@Column(name="sfee")
	private Double fee;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String scourse, Double fee) {
		super();
		this.name = name;
		this.scourse = scourse;
		this.fee = fee;
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

	public String getScourse() {
		return scourse;
	}

	public void setScourse(String scourse) {
		this.scourse = scourse;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", scourse=" + scourse + ", fee=" + fee + "]";
	}	
	
}
