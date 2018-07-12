package com.sushma.JPA2JPAInheritanceSingleTable.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="pmode", discriminatorType=DiscriminatorType.STRING)
public abstract class Payment {
	
	@Id
	@Column(name="PAYMENT_ID")
	private long id;
	
	private double amount;

	public Payment() {
		super();
	}

	public Payment(long id, double amount) {
		super();
		this.id = id;
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", amount=" + amount + "]";
	}
}