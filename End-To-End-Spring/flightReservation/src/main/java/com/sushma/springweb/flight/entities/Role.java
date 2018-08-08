package com.sushma.springweb.flight.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="ROLE")
public class Role extends AbstractEntity implements GrantedAuthority{

	private static final long serialVersionUID = 1L;
	@Column(name="name")
	private String name;

	public String getName() {
		return name;
	}
	
	@ManyToMany(mappedBy="roles")
	private Set<User> users;  

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [name=" + name + " getId()=" + getId() + "]";
	}

	@Override
	public String getAuthority() {
		return name;
	}
}
