package za.ac.cput.repository;

import za.ac.cput.domain.impl.Customer;

public interface CustomerRepository {
    void save(Customer customer);

    void update(Customer customer);

    void delete(Customer customer);

    Customer findById(int customerId);
}
