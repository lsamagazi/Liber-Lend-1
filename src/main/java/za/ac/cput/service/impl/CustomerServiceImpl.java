package za.ac.cput.service.impl;

/**
 * CustomerServiceImpl.java
 * Author: Lonwabo Sibusisiwe Magazi- 218331851
 * Date: May 2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cput.domain.impl.Customer;
import za.ac.cput.repository.CustomerRepository;
import za.ac.cput.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.update(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public Customer getCustomerById(int customerId) {
        return customerRepository.findById(customerId);
    }
}
