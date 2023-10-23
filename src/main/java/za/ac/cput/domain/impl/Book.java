package za.ac.cput.domain.impl;

/**
 * Book.java
 * Class for the Book
 * Author: Peter Buckingham (220165289)
 * Date: 17 March 2021
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
public class Book {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String title;
    private  String author;
    private String publisher;
    private String isbn;
    private String imageLink;
    private String description;
    private String genre;
    private String language;
    private int edition;

    public Book() {
        // Default constructor
    }

    private Book (Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
        this.publisher = builder.publisher;
        this.isbn = builder.isbn;
        this.imageLink = builder.imageLink;
        this.description = builder.description;
        this.genre = builder.genre;
        this.language = builder.language;
        this.edition = builder.edition;
    }

    public static Builder builder() {
        return new Builder();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // getters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getisbn() {
        return isbn;
    }

    public String getImageLink() {
        return imageLink;
    }

    public String getDescription() {
        return description;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public int getEdition() {
        return edition;
    }

    // Builder class

    public static class Builder {
        private int id;
        private  String title;
        private  String author;
        private  String publisher;
        private  String isbn;
        private String imageLink;
        private String description;
        private String genre;
        private String language;
        private int edition;

        public Builder id(int id) {
            this.id = id;
            return this;
        }
        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder author(String author) {
            this.author = author;
            return this;
        }
        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }
        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder imageLink(String imageLink) {
            this.imageLink = imageLink;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder language(String language) {
            this.language = language;
            return this;
        }

        public Builder edition(int edition) {
            this.edition = edition;
            return this;
        }

        public Book build() {
            return new Book(this);
        }

        public Builder copy(Book book) {
            this.id = book.id;
            this.title = book.title;
            this.author = book.author;
            this.publisher = book.publisher;
            this.isbn = book.isbn;
            this.imageLink = book.imageLink;
            this.description = book.description;
            this.genre = book.genre;
            this.language = book.language;
            this.edition = book.edition;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Book other)) return false;
        return Objects.equals(title, other.title) &&
                Objects.equals(isbn, other.isbn) &&
                edition == other.edition &&
                Objects.equals(imageLink, other.imageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, isbn, edition, imageLink);
    }
}
