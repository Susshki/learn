package com.sushma.springweb.flight.dto;

import org.springframework.stereotype.Component;

@Component
public class ReservationUpdateRequest {

	private int id;
	private Boolean checkIn;
	private  int numberOfBags;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Boolean getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Boolean checkIn) {
		this.checkIn = checkIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	@Override
	public String toString() {
		return "ReservationUpdateRequest [id=" + id + ", checkIn=" + checkIn + ", numberOfBags=" + numberOfBags + "]";
	}	
}
