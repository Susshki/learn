package com.sushma.springweb.flightcheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sushma.springweb.flightcheckin.dto.Reservation;
import com.sushma.springweb.flightcheckin.dto.ReservationUpdateRequest;
import com.sushma.springweb.flightcheckin.integration.RestClientImpl;

@Controller
public class FlightCheckInController {
	@Autowired
	private RestClientImpl restClientImpl;
	
	@RequestMapping("/")
	public String showHomePage() {
		return "homePage";
	}
	
	
	@RequestMapping("/showCheckIn")
	public String showCheckIn() {
		return "showCheckIn";
	}
	
	@RequestMapping(value="/startCheckIn", method=RequestMethod.POST)
	public String startCheckIn(@RequestParam("id") int reservationId, ModelMap modelMap) {
		Reservation reservation = restClientImpl.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "updateCheckIn";
	}
	
	@RequestMapping(value="/updateReservation", method=RequestMethod.POST)
	public String updateReservation(@RequestParam("numberOfBags") int numberOfBags, @RequestParam("id") int id, ModelMap modelMap) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setCheckIn(true);
		request.setNumberOfBags(numberOfBags);
		request.setId(id);
		restClientImpl.updateReservation(request);
		Reservation reservation = restClientImpl.findReservation(id);
		modelMap.addAttribute("reservation", reservation);
		return "confirmCheckIn";
	}
}
