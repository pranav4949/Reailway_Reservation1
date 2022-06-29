package com.Reservation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Reservation.Model.ReservationModel;
import com.Reservation.Repository.ReservationRepository;
@Service
public class ReservationService {
	
	
	@Autowired
	ReservationRepository reservationRepository;

	public void postReservationModel(ReservationModel reservationModel) {
		reservationRepository.save(reservationModel);
		
	}

}
