package com.sushma.springweb.flight.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sushma.springweb.flight.entities.Flight;
import com.sushma.springweb.flight.service.FlightService;

@Controller
public class FlightController {

	@Autowired
	private FlightService flightService;
	
	@RequestMapping("/findflights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to")String to, @DateTimeFormat(pattern="MM-dd-yyyy") Date dateOfDeparture, ModelMap modelMap) {
		List<Flight> flights = flightService.findFlights(from, to, dateOfDeparture);
		modelMap.addAttribute("flights", flights);
		
		return "displayflights";
	}
	
	@RequestMapping("/admin/addflight")
	public String addFlight() {
		//TODO
		return "addflight";
	}
}
