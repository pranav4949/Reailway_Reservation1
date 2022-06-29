package com.Reservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Reservation.Model.ReservationModel;
import com.Reservation.Service.ReservationService;
@RestController
@RequestMapping("/reserve")
public class ReservationController {
	
	
	@Autowired
	ReservationService reservationService;
	
	
	@PostMapping("/post")
	private String postReservationModel(@RequestBody ReservationModel reservationModel) {
		reservationService.postReservationModel(reservationModel);
		return "Data posted sucessfully....";
	}

}
