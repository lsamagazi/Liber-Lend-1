package za.ac.cput.factory;

/**
 * LoanFactory.java
 * Author: Lonwabo Sibusisiwe Magazi- 218331851
 * Date: May 2023
 */

import za.ac.cput.domain.impl.Book;
import za.ac.cput.domain.impl.Customer;
import za.ac.cput.domain.impl.Loan;

import java.time.LocalDate;

public class LoanFactory {
    public static Loan createLoan(int loanId, Customer customer, Book book, LocalDate loanDate, LocalDate dueDate, LocalDate returnDate) {
        Loan loan = new Loan();
        loan.setLoanId(loanId);
        loan.setCustomer(customer);
        loan.setBook(book);
        loan.setLoanDate(loanDate);
        loan.setDueDate(dueDate);
        loan.setReturnDate(returnDate);
        return loan;
    }
}

