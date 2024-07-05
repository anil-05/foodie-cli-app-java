package com.trainingmug.foodiecliap.service;

import com.trainingmug.foodiecliap.exception.OrderExistsException;
import com.trainingmug.foodiecliap.exception.OrderNotFoundException;
import com.trainingmug.foodiecliap.model.Order;

import java.util.List;

public interface OrderService {

    public List<Order> getOrdersList();
    public Order getOrderById(String id) throws OrderNotFoundException;
    public Order save(Order order) throws OrderExistsException;
}
