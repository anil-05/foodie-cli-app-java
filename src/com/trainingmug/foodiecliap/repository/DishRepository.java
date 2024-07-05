package com.trainingmug.foodiecliap.repository;

import com.trainingmug.foodiecliap.model.Customer;
import com.trainingmug.foodiecliap.model.Dish;
import com.trainingmug.foodiecliap.util.CsvReader;

import java.util.List;
import java.util.Optional;

public class DishRepository {

    private final List<Dish> dishesList;

    public DishRepository() {
        CsvReader csvReader = new CsvReader();
        this.dishesList = csvReader.readDishesFromCsv();
    }

    public List<Dish> getAllDishes(){
        return this.dishesList;
    }

    public Optional<Dish> findDishById(String id) {

        return this.dishesList.stream().filter(dish -> dish.getId().equals(id)).findFirst();
    }

    public Dish saveDish(Dish dish) {
        this.dishesList.add(dish);
        return dish;
    }

    public Dish updateDish(Dish dish) {
        this.dishesList.add(dish);
        return dish;
    }

    public void deleteDish(Dish dish) {
        dishesList.remove(dish);
    }
}
