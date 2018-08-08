package com.sushma.springweb.flight.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="RESERVATION")
public class Reservation extends AbstractEntity{
	
	@Column(name="CHECK_IN")
	private Boolean checkedIn=false;
	
	@Column(name="NUMBER_OF_BAGS")
	private int numOfBags=0;
	
	@OneToOne
	private Passenger passenger;
	
	@OneToOne
	private Flight flight;
	
	@Column(name="CREATED")
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

	@Override
	public String toString() {
		return "Reservation [checkedIn=" + checkedIn + ", numOfBags=" + numOfBags + ", passenger=" + passenger
				+ ", flight=" + flight + ", created=" + created + "]";
	}
}
