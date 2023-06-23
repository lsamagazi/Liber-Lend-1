package za.ac.cput.repository;

/**
 * CustomerRepository.java
 * Author: Lonwabo Sibusisiwe Magazi- 218331851
 * Date: May 2023
 */


import za.ac.cput.domain.impl.Customer;

public interface CustomerRepository {
    void save(Customer customer);

    void update(Customer customer);

    void delete(Customer customer);

    Customer findById(int customerId);
}
