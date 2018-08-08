package com.sushma.springweb.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.springweb.location.entities.Location;
import com.sushma.springweb.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements ILocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public Location createLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public int deleteLocation(int id) {
		locationRepository.deleteById(id);
		return id;
	}

	@Override
	public List<Location> getAllLocations() {
		List<Location> locations = locationRepository.findAll();
		return locations;
	}

	@Override
	public Location getLocationById(int id) {
		Optional<Location> locOpt = locationRepository.findById(id);
		if(locOpt.isPresent())
			return locOpt.get();
		return null;
	}
	
	
}
