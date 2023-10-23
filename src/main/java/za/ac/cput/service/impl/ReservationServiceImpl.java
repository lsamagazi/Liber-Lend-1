package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.impl.Reservation;
import za.ac.cput.repository.ReservationRepository;
import za.ac.cput.service.ReservationService;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation create(Reservation reservation) {
        System.out.println("ReservationServiceImpl: create");
        if (reservation.getId() != 0) {
            throw new IllegalArgumentException("ID should not be set for a new entity.");
        }
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation read(int id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public Reservation updateById(int reservationId, Reservation updatedReservation) {
        Reservation existingReservation = reservationRepository.findById(reservationId).orElse(null);

        if (existingReservation != null) {
            existingReservation.setReservationDate(updatedReservation.getReservationDate());
            // Update other properties as needed

            return reservationRepository.save(existingReservation);
        } else {
            return null; // You can also throw an exception to indicate the resource was not found
        }
    }

    @Override
    public boolean delete(int id) {
        reservationRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(int reservationId) {
        return reservationRepository.findById(reservationId).orElse(null);
    }

    @Override
    public Reservation update(Reservation reservation) {
        return null;
    }
}
