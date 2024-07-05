package com.trainingmug.foodiecliap;

import com.trainingmug.foodiecliap.model.Dish;
import com.trainingmug.foodiecliap.repository.CustomerRepository;
import com.trainingmug.foodiecliap.repository.DishRepository;
import com.trainingmug.foodiecliap.repository.RestaurantRepository;
import com.trainingmug.foodiecliap.ui.Menu;
import com.trainingmug.foodiecliap.util.CsvReader;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.displayMenu();
    }

}
