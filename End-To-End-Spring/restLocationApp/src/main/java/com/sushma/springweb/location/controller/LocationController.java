package com.sushma.springweb.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.springweb.location.entities.Location;
import com.sushma.springweb.location.service.ILocationService;

@RestController
@RequestMapping("/locations")
public class LocationController {
	
	@Autowired
	private ILocationService service;
	
	@PostMapping
	public Location createLocation(@RequestBody Location location){
		return service.createLocation(location);		
	}
	
	@GetMapping
	public List<Location> getLocations(){
		return service.getAllLocations();
	}
	
	@PutMapping
	public  Location updateLocation(@RequestBody Location location) {
		return service.updateLocation(location);
	}
	
	@GetMapping("/{id}")
	public  Location getLocationById(@PathVariable(value = "id")  int id) {
		return service.getLocationById(id);
	}
	
	@DeleteMapping("/{id}")
	public int deleteLocation(@PathVariable("id") int id) {
		return service.deleteLocation(id);
	}
	
}
