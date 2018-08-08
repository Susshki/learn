package com.sushma.springweb.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.springweb.flight.entities.Passenger;
import com.sushma.springweb.flight.repos.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	public Passenger savePassenger(Passenger passenger) {
		return passengerRepository.save(passenger);
	}
}
