package com.trainingmug.foodiecliap.util;


import com.trainingmug.foodiecliap.model.Customer;
import com.trainingmug.foodiecliap.model.Dish;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    /*
    Read the data from CSV files and create a List of objects
     */
    public List<Customer> readCustomersFromCsv(){
        String customerCsvFilePath  = "C:\\Users\\ADMIN\\IdeaProjects\\foodie-cli-app-java\\data\\customers.csv";
        List<Customer> customerList = new ArrayList<>();
        //java io classes (File Reader, BufferedReader)
        //try-with-resource
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(customerCsvFilePath))) {
            String csvSplitBy = ",";
            br.readLine();
            while((line = br.readLine()) != null){
                //c001,john doe, john.doe@gmail.com, johndoe@1234
                String[] data = line.split(csvSplitBy);
                Customer customer = new Customer();
                customer.setId(data[0]);
                customer.setName(data[1]);
                customer.setEmail(data[2]);
                customer.setPassword(data[3]);

                customerList.add(customer);
            }


        } catch(IOException e){
            System.out.println("File not found in the path : "+ customerCsvFilePath );
            System.exit(0);
            e.printStackTrace();
        }

        return customerList;

    }

    public List<Dish> readDishesFromCsv(){
        String dishCsvFilePath  = "C:\\Users\\ADMIN\\IdeaProjects\\foodie-cli-app-java\\data\\dishes.csv";
        List<Dish> dishList = new ArrayList<>();
        //java io classes (File Reader, BufferedReader)
        //try-with-resource
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(dishCsvFilePath))) {
            String csvSplitBy = ",";
            br.readLine();
            while((line = br.readLine()) != null){
                //c001,john doe, john.doe@gmail.com, johndoe@1234
                String[] data = line.split(csvSplitBy);
                Dish dish = new Dish();
                dish.setId(data[0]);
                dish.setName(data[1]);
                dish.setDescription(data[2]);
                dish.setPrice(Double.parseDouble(data[3]));

                dishList.add(dish);
            }


        } catch(IOException e){
            System.out.println("File not found in the path : "+ dishCsvFilePath );
            System.exit(0);
            e.printStackTrace();
        }

        return dishList;

    }
}
