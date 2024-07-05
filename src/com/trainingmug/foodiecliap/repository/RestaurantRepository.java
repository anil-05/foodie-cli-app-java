package com.trainingmug.foodiecliap.repository;

import com.trainingmug.foodiecliap.model.Dish;
import com.trainingmug.foodiecliap.model.Restaurant;
import com.trainingmug.foodiecliap.util.CsvReader;

import java.util.List;
import java.util.Optional;

public class RestaurantRepository {

    private final List<Restaurant> restaurantsList;

    public RestaurantRepository() {
        CsvReader csvReader = new CsvReader();
        this.restaurantsList = csvReader.readRestaurantFromCsv();
    }

    public List<Restaurant> getAllRestaurants(){
        return this.restaurantsList;
    }

    public Optional<Restaurant> findRestaurantById(String id) {
        return this.restaurantsList.stream().filter(restaurant -> restaurant.getId().equals(id)).findFirst();
    }

    public Restaurant save(Restaurant restaurant) {
        this.restaurantsList.add(restaurant);
        return restaurant;
    }


    public Restaurant updateRestaurant(Restaurant restaurant) {
        this.restaurantsList.add(restaurant);
        return restaurant;
    }

    public void deleteRestaurant(Restaurant restaurant) {
        restaurantsList.remove(restaurant);
    }
}
