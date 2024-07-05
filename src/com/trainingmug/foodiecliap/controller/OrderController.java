package com.trainingmug.foodiecliap.controller;

import com.trainingmug.foodiecliap.exception.OrderExistsException;
import com.trainingmug.foodiecliap.exception.OrderNotFoundException;
import com.trainingmug.foodiecliap.model.Order;
import com.trainingmug.foodiecliap.service.OrderServiceImpl;

import java.util.List;

public class OrderController {

    private final OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    public List<Order> getOrdersList(){
        return this.orderService.getOrdersList();
    }

    public Order getOrderById(String id) throws OrderNotFoundException {
        return this.orderService.getOrderById(id);
    }

    public Order saveOrder(Order order) throws OrderExistsException {
        return this.orderService.save(order);
    }
}
