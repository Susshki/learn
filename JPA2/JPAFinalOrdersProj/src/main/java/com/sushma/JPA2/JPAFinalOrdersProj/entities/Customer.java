package com.sushma.JPA2.JPAFinalOrdersProj.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CUSTOMER_ID")
	private int id;
	
	@Column(name="CUSTOMER_NAME")
	private String name;
	
	private String email;
	
	@Embedded
	private Address address;
	
	@OneToMany
	private List<Order> orders;
	
	@ManyToMany
	@JoinTable(name="PRODUCTS_CUSTOMERS", joinColumns=@JoinColumn(name="CUSTOMER_ID", referencedColumnName="CUSTOMER_ID"),
	inverseJoinColumns=@JoinColumn(name="PRODUCT_ID", referencedColumnName="PRODUCT_ID"))
	private List<Product> products;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", orders="
				+ orders + ", products=" + products + "]";
	}

}
