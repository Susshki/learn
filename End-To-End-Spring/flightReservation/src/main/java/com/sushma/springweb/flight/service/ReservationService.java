package com.sushma.springweb.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sushma.springweb.flight.dto.ReservationRequest;
import com.sushma.springweb.flight.entities.Flight;
import com.sushma.springweb.flight.entities.Passenger;
import com.sushma.springweb.flight.entities.Reservation;
import com.sushma.springweb.flight.repos.ReservationRepository;
import com.sushma.springweb.flight.util.EmailUtil;
import com.sushma.springweb.flight.util.PDFGeneratorUtil;

@Service
public class ReservationService {
	@Value("${com.sushma.springweb.flight.reservation.PDF.file.path}")//This is suspicious as final string 
	public final String PDFFilePath="C:\\Sushma\\git\\learn\\End-To-End-Spring\\flightReservation\\reservations\\iternary_%s.pdf";
	
	@Autowired
	private ReservationRepository repository;
	
	@Autowired
	private FlightService flightService;
	
	@Autowired
	private PassengerService passengerService;
	
	@Autowired
	private PDFGeneratorUtil pdfUtil;
	
	@Autowired
	private EmailUtil emailUtil;
	
	public Reservation reserve(ReservationRequest reservationRequest) {
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(reservationRequest.getFirstName());
		passenger.setLastName(reservationRequest.getLastName());
		passenger.setMiddleName(reservationRequest.getMiddleName());
		passenger.setEmail(reservationRequest.getEmail());
		passenger.setPhone(reservationRequest.getPhone());
		Passenger savedPassenger = passengerService.savePassenger(passenger);
		
		Flight flight = flightService.getFlightById(reservationRequest.getFlightId());
		
		Reservation reservation = new Reservation();
		reservation.setPassenger(savedPassenger); //IMPORTANT
		reservation.setFlight(flight);
		Reservation savedReservation = repository.save(reservation);
		
		//PDF generator
		pdfUtil.generatePDF(savedReservation, String.format(PDFFilePath, reservation.getId()));
		
		//Email -- this would not work as I need to change the email security preferences on my email
		//emailUtil.sendEmail(reservation.getPassenger().getEmail(), "C:\\Sushma\\git\\learn\\End-To-End-Spring\\flightReservation\\reservations"+reservation.getId());
		
		return reservation;
		
	}
}
