package com.trainingmug.foodiecliap.repository;

import com.trainingmug.foodiecliap.model.Dish;
import com.trainingmug.foodiecliap.model.Restaurant;
import com.trainingmug.foodiecliap.util.CsvReader;

import java.util.List;

public class RestaurantRepository {

    private final List<Restaurant> restaurantsList;

    public RestaurantRepository() {
        CsvReader csvReader = new CsvReader();
        this.restaurantsList = csvReader.readRestaurantFromCsv();
    }

    public List<Restaurant> getAllRestaurants(){
        return this.restaurantsList;
    }
}
