package com.sushma.springweb.uploaddownloaddoc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="DOCUMENT")
public class Document {

	@Id
	private long id;
	private String name;	
	@Lob
	private byte[] data;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", name=" + name + "]";
	}
	
}
