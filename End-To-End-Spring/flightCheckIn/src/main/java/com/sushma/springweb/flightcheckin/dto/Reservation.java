package com.sushma.springweb.flightcheckin.dto;

import com.sushma.springweb.flightcheckin.dto.Flight;
import com.sushma.springweb.flightcheckin.dto.Passenger;

public class Reservation{
	private int id;
	private Boolean checkedIn=false;
	private int numOfBags=0;
	private Passenger passenger;
	private Flight flight;
	private String created;

	public Boolean getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumOfBags() {
		return numOfBags;
	}

	public void setNumOfBags(int numOfBags) {
		this.numOfBags = numOfBags;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Reservation [checkedIn=" + checkedIn + ", numOfBags=" + numOfBags + ", passenger=" + passenger
				+ ", flight=" + flight + ", created=" + created + "]";
	}
}
