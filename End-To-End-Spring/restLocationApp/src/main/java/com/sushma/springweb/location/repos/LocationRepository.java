package com.sushma.springweb.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sushma.springweb.location.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{

}
