package com.sushma.springmvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.springmvc.entities.Location;
import com.sushma.springmvc.repos.LocationRepository;

@Service
public class LocationServiceImpl implements ILocationService{
	
	@Autowired
	private LocationRepository locationRepository;	


	@Override
	public Location saveLocation(Location location) {
		locationRepository.save(location);
		return location;
	}
	
	@Override
	public Location updateLocation(Location loc) {
		Optional<Location> location = locationRepository.findById(loc.getId());
		
		if(location.isPresent()) {
			locationRepository.save(loc);
			return loc;
		}
		
		return null;	
	}	

	@Override
	public  int deleteLocation(Location loc) {
		locationRepository.delete(loc);
		return loc.getId();
	}
	
	@Override
	public Location getLocationById(int id) {
		Optional<Location> location = locationRepository.findById(id);
		
		if(location.isPresent()) {
			return location.get();
		}		
		return null;
	}	
	
	@Override
	public List<Location> getAllLocations(){
		List<Location> locations = locationRepository.findAll(); //use JPA Crud Reposiotry
		return locations;	
	}
	
}
