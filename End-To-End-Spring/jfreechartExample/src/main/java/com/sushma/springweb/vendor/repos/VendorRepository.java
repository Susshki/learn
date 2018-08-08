package com.sushma.springweb.vendor.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sushma.springweb.vendor.entities.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer>{

	@Query(value="select VENDOR_TYPE, COUNT(VENDOR_TYPE) from VENDOR GROUP BY VENDOR_TYPE", nativeQuery=true)
	public List<Object[]> getVendorTypeData();

}
