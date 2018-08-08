package com.sushma.springmvc.service;

import java.util.List;

import com.sushma.springmvc.entities.Location;

public interface ILocationService {
	public Location saveLocation(Location location);
	public Location updateLocation(Location location);
	public int deleteLocation(Location location);
	public Location getLocationById(int id);
	public List<Location> getAllLocations();
}
