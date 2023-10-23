/* Author.java
 Entity for the Author
 Author: Asiphe Funda (215092317)
 Date: 19 March 2023
*//*


package za.ac.cput.domain.impl;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Author {

    @Id
    private static int id;
    private String firstName;
    private String lastName;
    private String biography;

    private Author(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.biography = builder.biography;
    }

    protected Author() {

    }

    public static int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBiography() {
        return biography;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", biography='" + biography + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName) && Objects.equals(biography, author.biography);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, biography);
    }

    public static class Builder{
        private int id;
        private String firstName;
        private String lastName;
        private String biography;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setBiography(String biography) {
            this.biography = biography;
            return this;
        }

        public Builder copy(Author author) {
            this.id = author.id;
            this.firstName = author.firstName;
            this.lastName = author.lastName;
            this.biography = author.biography;
            return this;
        }
        public Author build(){return new Author(this);}
    }
}
*/
