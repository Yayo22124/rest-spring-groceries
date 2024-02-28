package com.haziel.groceries.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.haziel.groceries.models.SalesModel;
import com.haziel.groceries.models.SalesModel;

@RestController
@RequestMapping("/groceries/sales")
public class SalesController {
    private final Gson gson;

    public SalesController() {
        this.gson = new Gson();
    }

    @GetMapping("/")
    public String getSales() {
        List<SalesModel> sales = new ArrayList<SalesModel>();
        sales.add(new SalesModel(UUID.randomUUID(), "25/02/24", UUID.randomUUID(), UUID.randomUUID(), 18.0, "Sabritas"));
        sales.add(new SalesModel(UUID.randomUUID(), "26/02/24", UUID.randomUUID(), UUID.randomUUID(), 18.0, "Sabritas"));
        sales.add(new SalesModel(UUID.randomUUID(), "27/02/24", UUID.randomUUID(), UUID.randomUUID(), 20.0, "Fuze-tea"));
        sales.add(new SalesModel(UUID.randomUUID(), "25/02/24", UUID.randomUUID(), UUID.randomUUID(), 21.0, "coca-cola"));
        sales.add(new SalesModel(UUID.randomUUID(), "29/02/24", UUID.randomUUID(), UUID.randomUUID(), 18.0, "Sabritas"));
        
        String jsonSales = gson.toJson(sales);

        return jsonSales;
    }
}
