package com.trainingmug.foodiecliap.service;

import com.trainingmug.foodiecliap.exception.DishExistsException;
import com.trainingmug.foodiecliap.exception.DishNotFoundException;
import com.trainingmug.foodiecliap.model.Dish;

import java.util.List;

public interface DishService {

    public List<Dish> getDishesList();

    public Dish save(Dish dish) throws DishExistsException;
    public Dish getDishById(String id) throws DishNotFoundException;
    public Dish update(Dish dish) throws DishNotFoundException;

    public void delete(String id) throws DishNotFoundException;
}
