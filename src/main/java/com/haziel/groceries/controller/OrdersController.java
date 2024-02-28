package com.haziel.groceries.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.haziel.groceries.models.OrdersModel;
import com.haziel.groceries.models.OrdersModel;

@RestController
@RequestMapping("/groceries/orders")
public class OrdersController {
    private final Gson gson;

    public OrdersController() {
        this.gson = new Gson();
    }

    @GetMapping("/")
    public String getOrders() {
        List<OrdersModel> orders = new ArrayList<OrdersModel>();
        orders.add(new OrdersModel(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), "22/02/24"));
        orders.add(new OrdersModel(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), "28/02/24"));
        orders.add(new OrdersModel(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), "24/02/24"));
        orders.add(new OrdersModel(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), "1/01/24"));
        orders.add(new OrdersModel(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), "2/01/24"));

        
        String jsonOrders = gson.toJson(orders);

        return jsonOrders;
    }
}
