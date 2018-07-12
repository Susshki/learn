package com.sushma.JPA2.JPAManyToMany.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Programmer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PROGRAMMER_ID")
	private int id;
	
	@Column(name="PRAGRAMMER_NAME")
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="programmer_project", // name of the third column
	joinColumns=@JoinColumn(name="PROG_ID", referencedColumnName="PROGRAMMER_ID"),// name of the column in third table and refcol name here
	inverseJoinColumns=@JoinColumn(name="PROJ_ID", referencedColumnName="PROJECT_ID")//inverse relation
	)
	private Set<Project> projects;
	

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

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	
}
