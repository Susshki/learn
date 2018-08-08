package com.sushma.springweb.flight.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FLIGHT")
public class Flight extends AbstractEntity {

	@Column(name = "FLIGHT_NUMBER")
	private String flightNumber;

	@Column(name = "AIRLINES")
	private String airlines;

	@Column(name = "DEPARTURE_CITY")
	private String departureCity;

	@Column(name = "ARRIVAL_CITY")
	private String arrivalCity;

	@Column(name = "DATE_OF_DEPARTURE")
	private Date dateOfDeparture;

	@Column(name = "TIME_OF_DEPARTURE")
	private Timestamp timeOfDeparture;

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
