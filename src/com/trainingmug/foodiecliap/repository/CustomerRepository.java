package com.trainingmug.foodiecliap.repository;

import com.trainingmug.foodiecliap.model.Customer;
import com.trainingmug.foodiecliap.util.CsvReader;

import java.util.List;

public class CustomerRepository {

    private final List<Customer> customersList;

    public CustomerRepository() {
        CsvReader csvReader = new CsvReader();
        this.customersList = csvReader.readCustomersFromCsv();
    }

    public List<Customer> getAllCustomers(){
        return this.customersList;
    }

    public Customer save(Customer customer){
        this.customersList.add(customer);
        return customer;
    }




}
