package com.sushma.springweb.flight.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sushma.springweb.flight.entities.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

}
