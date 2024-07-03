package com.trainingmug.foodiecliap.service;

import com.trainingmug.foodiecliap.exception.CustomerExistsException;
import com.trainingmug.foodiecliap.model.Customer;
import com.trainingmug.foodiecliap.repository.CustomerRepository;

import java.util.Optional;

public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) throws CustomerExistsException {
        //if already exists(id, name, email) then throw CustomerExistsException
        //else save the customer in the repository

        Optional<Customer> customerById = this.customerRepository.findCustomerById((customer.getId()));
        if(customerById.isPresent())
            throw new CustomerExistsException("Customer already exists with this id : " + customer.getId());
        return this.customerRepository.save(customer);

    }
}
