package com.sushma.springweb.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sushma.springweb.flightcheckin.dto.Reservation;
import com.sushma.springweb.flightcheckin.dto.ReservationUpdateRequest;

@Component
public class RestClientImpl implements RestClient{

	public static final String RESERVATION_REST_BASE_URI="http://localhost:8080/dairlines/reservations/";
	@Override
	public Reservation findReservation(int id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REST_BASE_URI+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATION_REST_BASE_URI, request, Reservation.class);
		return reservation;
	}

}
