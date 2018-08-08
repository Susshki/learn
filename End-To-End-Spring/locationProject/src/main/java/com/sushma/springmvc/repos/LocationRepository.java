package com.sushma.springmvc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sushma.springmvc.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{
	
}
