package com.sushma.springweb.vendor.service;

import java.util.List;

import com.sushma.springweb.vendor.entities.Vendor;

public interface IVendorService {
	public Vendor createVendor(Vendor vendor);
	public void deleteVendor(int id);
	public List<Vendor> getAllVendors();
	public Vendor getVendorByid(int id);
	public Vendor updateVendor(Vendor vendor);
	
}
