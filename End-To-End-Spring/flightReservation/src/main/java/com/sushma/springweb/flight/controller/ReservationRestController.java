package com.sushma.springweb.flight.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.springweb.flight.dto.ReservationUpdateRequest;
import com.sushma.springweb.flight.entities.Reservation;
import com.sushma.springweb.flight.repos.ReservationRepository;

@RestController
public class ReservationRestController {
	
	@Autowired
	private ReservationRepository reservationRepository;

	@RequestMapping("/reservations/{id}")
	public Reservation getReservation(@PathVariable int id) {
		Optional<Reservation> reservation  = reservationRepository.findById(id);
		if(reservation.isPresent()) {
			return reservation.get();
		}
		
		return null;	
	}
	
	@RequestMapping(value="/reservations", method=RequestMethod.POST)
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		Optional<Reservation> reservationOpt  = reservationRepository.findById(request.getId());
		if(reservationOpt.isPresent()) {
			Reservation reservation = reservationOpt.get();
			reservation.setCheckedIn(request.getCheckIn());
			reservation.setNumOfBags(request.getNumberOfBags());
			return reservationRepository.save(reservation);			
		}
		return null;
	}
	
	
}
