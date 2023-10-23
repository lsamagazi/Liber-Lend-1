/*
package za.ac.cput.domain.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;


@Entity public class Publisher {
    @Id
    private static int id;
    private String firstName;
    private String lastName;
    private String publisherNo;

    private Publisher(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.publisherNo = builder.publisherNo;
    }
    protected Publisher(){

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

    public String getPublisherNo() {
        return publisherNo;
    }



    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", biography='" + publisherNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher publisher)) return false;
        return Objects.equals(firstName, publisher.firstName) && Objects.equals(lastName, publisher.lastName) && Objects.equals(publisherNo, publisher.publisherNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, publisherNo);
    }

    public static class Builder{
        private int id;
        private String firstName;
        private String lastName;
        private String publisherNo;


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

        public Builder setPublisherNo(String publisherNo) {
            this.publisherNo = publisherNo;
            return this;
        }


        public Builder copy(Publisher publisher) {
            this.id = publisher.id;
            this.firstName = publisher.firstName;
            this.lastName = publisher.lastName;
            this.publisherNo = publisher.publisherNo;
            return this;
        }
        public Publisher build(){return new Publisher(this);
        }
    }
}
*/
