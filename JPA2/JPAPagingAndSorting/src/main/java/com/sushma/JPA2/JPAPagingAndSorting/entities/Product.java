package com.sushma.JPA2.JPAPagingAndSorting.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@Column(name="PRODUCT_ID", nullable=false)
	private int id;
	
	@Column(name="PRODUCT_NAME", nullable=false)
	private String name;
	
	@Column(name="PRODUCT_DESC", nullable=false)
	private String desc;
	
	@Column(nullable=false)
	private Double price;

	public Product() {
		super();
	}

	public Product(int id, String name, String desc, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
	}
	
}
