package com.trainingmug.foodiecliap.service;

import com.trainingmug.foodiecliap.exception.DishNotFoundException;
import com.trainingmug.foodiecliap.exception.RestaurantExistsException;
import com.trainingmug.foodiecliap.exception.RestaurantNotFoundException;
import com.trainingmug.foodiecliap.model.Dish;
import com.trainingmug.foodiecliap.model.Restaurant;

import java.util.List;

public interface RestaurantService {

    public List<Restaurant> getRestaurantList();
    public Restaurant save(Restaurant restaurant) throws RestaurantExistsException;

    public Restaurant getRestaurantById(String id) throws RestaurantNotFoundException;

    public Restaurant updateRestaurant(Restaurant restaurant) throws RestaurantNotFoundException;

    public void deleteRestaurant(String id) throws RestaurantNotFoundException;

    public List<Dish> getDishItems(String id) throws RestaurantNotFoundException, DishNotFoundException;
}
