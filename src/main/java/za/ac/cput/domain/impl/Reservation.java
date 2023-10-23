package za.ac.cput.domain.impl;

import jakarta.persistence.*;
import za.ac.cput.domain.impl.User;
import za.ac.cput.domain.impl.Book;

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

    // Constructors

    public Reservation() {
    }

    public Reservation(Builder builder) {
        this.id = builder.id;
        this.user = builder.user;
        this.book = builder.book;
        this.reservationDate = builder.reservationDate;
    }

    // Getters

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBook(Book book) {
        this.book = book;
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

    public static Builder builder() {
        return new Builder();
    }

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
            return new Reservation(this);
        }

        public Builder copy(Reservation reservation) {
            this.id = reservation.id;
            this.user = reservation.user;
            this.book = reservation.book;
            this.reservationDate = reservation.reservationDate;
            return this;
        }
    }
}
