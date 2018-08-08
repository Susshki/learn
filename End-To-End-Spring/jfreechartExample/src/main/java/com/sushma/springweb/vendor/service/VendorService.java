package com.sushma.springweb.vendor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.springweb.vendor.entities.Vendor;
import com.sushma.springweb.vendor.repos.VendorRepository;

@Service
public class VendorService implements IVendorService {

	@Autowired
	private VendorRepository repository;
	
	@Override
	public Vendor createVendor(Vendor vendor) {
		if(vendor != null)
			return repository.save(vendor);
		return null;
	}

	@Override
	public void deleteVendor(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<Vendor> getAllVendors() {
		List<Vendor> vendor = repository.findAll();
		return vendor;
	}

	@Override
	public Vendor getVendorByid(int id) {
		Optional<Vendor> vendorOpt =  repository.findById(id);
		
		if(vendorOpt.isPresent()) {
			return vendorOpt.get();
		}
		
		return null;
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return repository.save(vendor);//TODO more checks
	}

	public List<Object[]> getVendorTypeData() {
		return repository.getVendorTypeData();
	}

}
