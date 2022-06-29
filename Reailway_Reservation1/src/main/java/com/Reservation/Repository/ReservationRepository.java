package com.Reservation.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Reservation.Model.ReservationModel;
@Repository
public interface ReservationRepository extends CrudRepository<ReservationModel, Integer> {

}
