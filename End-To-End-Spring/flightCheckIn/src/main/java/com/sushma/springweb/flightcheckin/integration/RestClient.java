package com.sushma.springweb.flightcheckin.integration;

import com.sushma.springweb.flightcheckin.dto.Reservation;
import com.sushma.springweb.flightcheckin.dto.ReservationUpdateRequest;

public interface RestClient {
	public Reservation findReservation(int id);
	public Reservation updateReservation(ReservationUpdateRequest request);
}
