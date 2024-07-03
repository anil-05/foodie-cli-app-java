package com.trainingmug.foodiecliap.service;

import com.trainingmug.foodiecliap.exception.CustomerExistsException;
import com.trainingmug.foodiecliap.model.Customer;

public interface CustomerService {

    public Customer save(Customer customer) throws CustomerExistsException;
}
