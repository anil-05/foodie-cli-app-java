package com.trainingmug.foodiecliap.repository;

import com.trainingmug.foodiecliap.model.Customer;
import com.trainingmug.foodiecliap.model.Dish;
import com.trainingmug.foodiecliap.util.CsvReader;

import java.util.List;

public class DishRepository {

    private final List<Dish> dishesList;

    public DishRepository() {
        CsvReader csvReader = new CsvReader();
        this.dishesList = csvReader.readDishesFromCsv();
    }

    public List<Dish> getAllDishes(){
        return this.dishesList;
    }
}
