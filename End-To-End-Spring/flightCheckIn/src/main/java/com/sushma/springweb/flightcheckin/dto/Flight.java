package com.sushma.springweb.flightcheckin.dto;

import java.sql.Timestamp;
import java.util.Date;

public class Flight {
	private int id;
	private String flightNumber;
	private String airlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Timestamp timeOfDeparture;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getTimeOfDeparture() {
		return timeOfDeparture;
	}

	public void setTimeOfDeparture(Timestamp timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", airlines=" + airlines + ", departureCity=" + departureCity
				+ ", arrivalCity=" + arrivalCity + ", dateOfDeparture=" + dateOfDeparture + ", timeOfDeparture="
				+ timeOfDeparture + "]";
	}
}
