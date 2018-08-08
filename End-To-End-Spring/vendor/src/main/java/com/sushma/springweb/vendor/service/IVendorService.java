package com.sushma.springweb.vendor.service;

import java.util.List;

import com.sushma.springweb.vendor.entities.Vendor;

public interface IVendorService {

	List<Vendor> getAllVendors();
	Vendor createVendor(Vendor vendor);
	Vendor updateVendor(Vendor vendor);
	void deleteVendor(int id);
	Vendor getVendorById(int id);
}
