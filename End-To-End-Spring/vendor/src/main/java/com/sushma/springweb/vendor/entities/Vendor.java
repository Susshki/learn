package com.sushma.springweb.vendor.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vendor")
public class Vendor {
	
	@Id
	@Column(name="VENDOR_ID")
	private int id;
	
	@Column(name="VENDOR_CODE")
	private String code;
	
	@Column(name="VENDOR_NAME")
	private String name;
	
	@Column(name="VENDOR_TYPE")
	private String type;
	
	@Column(name="VENDOR_EMAIL")
	private String email;
	
	@Column(name="VENDOR_PHONE")
	private String phone;
	
	@Column(name="VENDOR_ADDR")
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + "]";
	}
}
