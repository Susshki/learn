package com.sushma.JPA2.JPAInheritanceJoined.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class CreditCard extends Payment {
	
	@Column(name="CARD_NUMBER")
	private String cardNumber;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public CreditCard() {
		super();
	}

	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", getId()=" + getId() + ", getAmount()=" + getAmount()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
