package za.ac.cput.domain.impl;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private LocalDateTime reservationDate;

    // Parameterized constructor
    public Reservation(int id, User user, Book book, LocalDateTime reservationDate) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.reservationDate = reservationDate;
    }

    // Default constructor
    public Reservation() {
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", user=" + user +
                ", book=" + book +
                ", reservationDate=" + reservationDate +
                '}';
    }

    // Builder pattern

    public static class Builder {
        private int id;
        private User user;
        private Book book;
        private LocalDateTime reservationDate;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public Builder book(Book book) {
            this.book = book;
            return this;
        }

        public Builder reservationDate(LocalDateTime reservationDate) {
            this.reservationDate = reservationDate;
            return this;
        }

        public Reservation build() {
            return new Reservation();
        }
    }

    // Copy method
    public Reservation copy(Reservation reservation) {
        return new Builder()
                .id(reservation.id)
                .user(reservation.user)
                .book(reservation.book)
                .reservationDate(reservation.reservationDate)
                .build();
    }
}
