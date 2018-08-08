package com.sushma.springweb.flight.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sushma.springweb.flight.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

	@Query(value="from Flight where departure_City=:departureCity and ARRIVAL_CITY=:arrivalCity and DATE_OF_DEPARTURE=:dateOfDeparture")
	public List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to, @Param("dateOfDeparture")Date dateOfDeparture);
	
	
}
