package com.sushma.springmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sushma.springmvc.entities.Location;
import com.sushma.springmvc.service.ILocationService;

@Controller
public class LocationController {
	@Autowired
	private ILocationService locationService;
	
	@RequestMapping(value="/showcreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping(value="/saveLocation", method = RequestMethod.POST)
	public String saveLocation(@ModelAttribute("location") Location loc, ModelMap modelMap) {
		Location location = locationService.saveLocation(loc);
		
		modelMap.addAttribute("createMsg", "Success fullly added location"+location.getId());
		return "createLocation";
	}
	
	@RequestMapping(value="/displayAllLocations")
	public String displayAllLocations(ModelMap  modelMap) {
		
		List<Location> locations = locationService.getAllLocations();
		modelMap.addAttribute("locations", locations);
		
		return "displayLocations";		
	}
	
	@RequestMapping(value="/deleteLocation")
	public String deleteLocation(@RequestParam(value="id") int id, ModelMap modelMap) {
		Location location  = new Location();
		location.setId(id);	
		locationService.deleteLocation(location);		
		
		List<Location> locations = locationService.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	@RequestMapping(value="/editLocation", method=RequestMethod.GET)
	 public  String editLocation(@RequestParam(value="id") int id, ModelMap modelMap) {
		Location location = locationService.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "editLocation";
	}
	
	@RequestMapping("/updateLocation")
	 public  String editLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		locationService.updateLocation(location);
		
		List<Location> locations = locationService.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
}
