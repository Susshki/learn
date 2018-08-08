package com.sushma.springweb.vendor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.springweb.vendor.entities.Vendor;
import com.sushma.springweb.vendor.repos.VendorRepository;

@Service
public class VendorService implements IVendorService{

	@Autowired
	private VendorRepository vendorRepository;

	@Override
	public List<Vendor> getAllVendors() {
		return vendorRepository.findAll();
	}

	@Override
	public Vendor createVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public void deleteVendor(int id) {		
		vendorRepository.deleteById(id);
	}

	@Override
	public Vendor getVendorById(int id) {
		Optional<Vendor> vendorOpt = vendorRepository.findById(id);
		if(vendorOpt.isPresent()) {
			return vendorOpt.get();
		}
		return null;
	}
}
