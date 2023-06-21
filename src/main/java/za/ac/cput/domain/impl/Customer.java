package za.ac.cput.domain.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    private int customerId;
    private String firstName;
    private String lastName;
    private String contactInfo;
    private String loanHistory;

    // Default constructor
    public Customer() {
    }

    // Parameterized constructor
    public Customer(int customerId, String firstName, String lastName, String contactInfo, String loanHistory) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
        this.loanHistory = loanHistory;
    }

    // Getters and setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getLoanHistory() {
        return loanHistory;
    }

    public void setLoanHistory(String loanHistory) {
        this.loanHistory = loanHistory;
    }
}
