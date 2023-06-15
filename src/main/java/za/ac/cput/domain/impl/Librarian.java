package za.ac.cput.domain.impl;
/**
 * Librarian.java
 * Class for Librarian.
 * Author: Cwenga Dlova(214310671)
 * Date: 19 March 2023
 */
public class Librarian  {
    private String firstName;
    private String lastName;
    private int contactNo;
    private String office;
    private String tasks;



    public Librarian() {
    }

    public Librarian(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.contactNo = builder.contactNo;
        this.office = builder.office;
        this.tasks = builder.tasks;
    }

    @Override

    public String toString() {

        return "Librarian{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNo=" + contactNo +
                ", office='" + office + '\'' +
                ", tasks='" + tasks + '\'' +
                '}';
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int contactNo;
        private String office;
        private String tasks;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setContactNo(int contactNo) {
            this.contactNo = contactNo;
            return this;
        }

        public Builder setOffice(String office) {
            this.office = office;
            return this;
        }

        public Builder setTasks(String tasks) {
            this.tasks = tasks;
            return this;
        }

        public Builder copy(Librarian librarian) {
            this.firstName = librarian.firstName;
            this.lastName = librarian.lastName;
            this.contactNo = librarian.contactNo;
            this.office = librarian.office;
            this.tasks = librarian.tasks;

            return this;
        }

        public Librarian build() {

            return new Librarian(this);
        }
    }
}
