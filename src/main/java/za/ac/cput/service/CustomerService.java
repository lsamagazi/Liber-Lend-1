package za.ac.cput.service;

import za.ac.cput.domain.impl.Customer;

public interface CustomerService {
    void createCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Customer getCustomerById(int customerId);
}
