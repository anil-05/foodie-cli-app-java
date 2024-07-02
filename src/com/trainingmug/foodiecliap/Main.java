package com.trainingmug.foodiecliap;

import com.trainingmug.foodiecliap.util.CsvReader;

public class Main {
    public static void main(String[] args) {
        CsvReader csvReader = new CsvReader();
        System.out.println(csvReader.readCustomersFromCsv());
        System.out.println(csvReader.readDishesFromCsv());
    }
}
