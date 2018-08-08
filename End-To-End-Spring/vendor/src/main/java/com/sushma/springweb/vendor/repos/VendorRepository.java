package com.sushma.springweb.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sushma.springweb.vendor.entities.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
