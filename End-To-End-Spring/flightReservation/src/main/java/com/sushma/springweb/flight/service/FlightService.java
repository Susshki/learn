package com.sushma.springweb.flight.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.springweb.flight.entities.Flight;
import com.sushma.springweb.flight.repos.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepository;
	
	public List<Flight> findFlights(String from, String to, Date dateOfDeparture) {
		List<Flight> flights = flightRepository.findFlights(from, to, dateOfDeparture);
		return flights;
	}
	
	public Flight getFlightById(int id) {
		Optional<Flight> flight = flightRepository.findById(id);
		
		if(flight.isPresent()) {
			return flight.get();
		}
		
		return null;
	}
}
