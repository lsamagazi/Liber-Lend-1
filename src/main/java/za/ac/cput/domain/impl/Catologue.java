package za.ac.cput.domain.impl;
/**
 * Catologue.java
 * Shamiso Moyo CHaka 220365393
 * Date: 20 March 2021
 */
import java.util.Objects;

public class Catologue {

    private String Title;
    private String Author;

    private String publisher;
    private String ISBN;
    private String reviews;

    private String description;

    public Catologue() {
    }

    private Catologue(Builder builder){
        this.Title = builder.Title;
        this.Author = builder.Author;
        this.publisher = builder.publisher;
        this.ISBN = builder.ISBN;
        this.reviews = builder.reviews;
        this.description = builder.description;

    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getReviews() {
        return reviews;
    }

    public String getDescription() {
        return description;
    }



    public static class Builder {
        private String Title;
        private String Author;

        private String publisher;
        private String ISBN;
        private String reviews;

        private String description;



    public Builder setTitle(String title) {
        this.Title= title;
        return this;
    }

    public Builder setAuthor(String author) {
        this.Author = author;
        return this;
    }
    public  Builder setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public  Builder setISBN(String isbn) {
        this.ISBN =ISBN;
        return this;
    }

    public  Builder setreviews(String reviews){
        this.reviews = reviews;
        return this;
    }
    public  Builder setDescription(String descriptiony) {
        this.description = description;
        return this;
    }

        @Override
        public String toString() {
            return "Builder{" +
                    "Title='" + Title + '\'' +
                    ", Author='" + Author + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", ISBN='" + ISBN + '\'' +
                    ", reviews='" + reviews + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(Title, builder.Title) && Objects.equals(Author, builder.Author) && Objects.equals(publisher, builder.publisher) && Objects.equals(ISBN, builder.ISBN) && Objects.equals(reviews, builder.reviews) && Objects.equals(description, builder.description);
        }

        @Override
        public int hashCode() {
            return Objects.hash(Title, Author, publisher, ISBN, reviews, description);
        }

        public Catologue Build() {
        return null;



}}}
