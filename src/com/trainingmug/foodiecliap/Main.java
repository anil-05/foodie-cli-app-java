package com.trainingmug.foodiecliap;

import com.trainingmug.foodiecliap.model.Dish;
import com.trainingmug.foodiecliap.repository.CustomerRepository;
import com.trainingmug.foodiecliap.repository.DishRepository;
import com.trainingmug.foodiecliap.repository.RestaurantRepository;
import com.trainingmug.foodiecliap.util.CsvReader;

public class Main {
    public static void main(String[] args) {
        //CsvReader csvReader = new CsvReader();
        //System.out.println(csvReader.readCustomersFromCsv());

        //CustomerRepository customerRepository = new CustomerRepository();
        //System.out.println(customerRepository.getAllCustomers());

        /*DishRepository dishRepository = new DishRepository();
        System.out.println(dishRepository.getAllDishes());
         */

        RestaurantRepository restaurantRepository = new RestaurantRepository();
        System.out.println(restaurantRepository.getAllRestaurants());
    }

}
