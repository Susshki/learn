package com.sushma.springweb.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sushma.springweb.flight.dto.ReservationRequest;
import com.sushma.springweb.flight.entities.Flight;
import com.sushma.springweb.flight.service.FlightService;
import com.sushma.springweb.flight.service.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	private FlightService flightService;
	
	@Autowired
	private ReservationService reservationService;
	

	@RequestMapping("/showreservation")
	public String showReservation(@RequestParam("id") int id, ModelMap modelMap){		
		
		Flight flight = flightService.getFlightById(id);		
		modelMap.addAttribute("flight", flight);		
		return "showcompletereservation";
		
	}

	@RequestMapping(value="/reservation", method=RequestMethod.POST)
	public String reservation(@ModelAttribute("reservationRequest") ReservationRequest reservationRequest) {
		reservationService.reserve(reservationRequest);
		
		return "confirmation";
	}
}
