package za.ac.cput.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.impl.Reservation;
import za.ac.cput.service.ReservationService;

import java.util.List;

@RestController
@RequestMapping("/api/admin/reservations")
public class AdminReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/list/all")
    public List<Reservation> getAll() {
        return reservationService.getAll();
    }

    @PostMapping("/create")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.create(reservation);
    }

    @GetMapping("/admin/read/{reservationId}")
    public Reservation readReservation(@PathVariable Integer reservationId) {
        return reservationService.read(reservationId);
    }

    @PutMapping("/admin/update/{reservationId}")
    public Reservation updateReservation(@PathVariable Integer reservationId, @RequestBody Reservation updatedReservation) {
        return reservationService.updateById(reservationId, updatedReservation);
    }

    @DeleteMapping("/admin/delete/{reservationId}")
    public boolean deleteReservation(@PathVariable Integer reservationId) {
        return reservationService.delete(reservationId);
    }
}
