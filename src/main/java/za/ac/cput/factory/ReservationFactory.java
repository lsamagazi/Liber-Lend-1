package za.ac.cput.factory;

import za.ac.cput.domain.impl.Reservation;
import za.ac.cput.domain.impl.Book;
import za.ac.cput.domain.impl.User;
import java.time.LocalDateTime;

public class ReservationFactory {

    public static Reservation createReservation(int id, User user, Book book, LocalDateTime reservationDate) {
        return new Reservation.Builder()
                .id(id)
                .user(user)
                .book(book)
                .reservationDate(reservationDate)
                .build();
    }
}
