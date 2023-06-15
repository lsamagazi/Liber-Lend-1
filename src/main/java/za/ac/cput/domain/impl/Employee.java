package za.ac.cput.domain.impl;
/**
 * Employee.java
 * Shamiso Moyo CHaka 220365393
 * Date: 20 March 2021
 */

import java.util.Objects;

public class Employee  {
    private int Employee_Id;
    private String FirstName;
    private String LastName;
    private String Email;
    private int PhoneNumber;

    private int Salary;
    private boolean isAdmin;

    public Employee() {
    }

    private Employee(Builder builder) {
        this.Employee_Id = builder.Employee_Id;
        this.FirstName = builder.FirstName;
        this.LastName = builder.LastName;
        this.Email = builder.Email;
        this.PhoneNumber = builder.PhoneNumber;
        this.Salary = builder.salary;
        this.isAdmin = builder.isAdmin;

    }

    public int getEmployee_Id() {
        return Employee_Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public int getSalary() {
        return Salary;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public static class Builder {
        private int salary;
        private int Employee_Id;
        private String FirstName;
        private String LastName;
        private String Email;
        private int PhoneNumber;
        private boolean isAdmin;


        public Builder setEmployee_Id(int employee_Id) {
            this.Employee_Id = employee_Id;
            return this;
        }

        public Builder setFirstName(String firstname) {
            this.FirstName = firstname;
            return this;
        }
        public Builder setLastName(String lastname) {
            this.LastName = lastname;
            return this;
        }

        public Builder setEmail(String email) {
            this.Email = email;
            return this;
        }

        public Builder setPhoneNumber(int phoneNumber) {
            this.PhoneNumber = phoneNumber;
            return this;
        }
        public Builder setsalary(int salary) {
            this.salary = salary;
            return this;
        }
        public Builder setIsAdmin(boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        public Employee Build() {
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee_Id=" + Employee_Id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", Salary=" + Salary +
                ", isAdmin=" + isAdmin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Employee_Id == employee.Employee_Id && PhoneNumber == employee.PhoneNumber && Salary == employee.Salary && Objects.equals(FirstName, employee.FirstName) && Objects.equals(LastName, employee.LastName) && Objects.equals(Email, employee.Email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Employee_Id, FirstName, LastName, Email, PhoneNumber, Salary , isAdmin);
    }
}

