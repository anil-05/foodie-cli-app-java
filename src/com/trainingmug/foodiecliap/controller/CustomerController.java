package com.trainingmug.foodiecliap.controller;

import com.trainingmug.foodiecliap.exception.CustomerExistsException;
import com.trainingmug.foodiecliap.model.Customer;
import com.trainingmug.foodiecliap.service.CustomerServiceImpl;

public class CustomerController {

    private final CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    public Customer save(Customer customer) throws CustomerExistsException {
        return this.customerService.save(customer);
    }

    public void deleteCustomer(String id) {
        this.customerService.deleteCustomer(id);

    }

    public Customer updateCustomer(Customer customer) {
        return this.customerService.updateCustomer(customer);
    }
}
