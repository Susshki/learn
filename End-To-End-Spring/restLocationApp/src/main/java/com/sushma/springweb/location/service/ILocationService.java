package com.sushma.springweb.location.service;

import java.util.List;

import com.sushma.springweb.location.entities.Location;

public interface ILocationService {
	public  Location createLocation(Location location);
	public Location updateLocation(Location location);
	public int deleteLocation(int id);
	public List<Location> getAllLocations();
	public Location getLocationById(int id);
	
}
