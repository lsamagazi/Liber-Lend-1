package za.ac.cput.service;

import za.ac.cput.domain.impl.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation create(Reservation reservation);
    Reservation read(int reservationId);
    Reservation updateById(int reservationId, Reservation updatedReservation);
    boolean delete(int reservationId);
    List<Reservation> getAll();
    Reservation getReservationById(int reservationId);
    Reservation update(Reservation reservation);
}
