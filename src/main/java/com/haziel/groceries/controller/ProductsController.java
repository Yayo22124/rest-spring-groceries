package com.haziel.groceries.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.haziel.groceries.models.EmployeesModel;
import com.haziel.groceries.models.ProductsModel;

@RestController
@RequestMapping("/groceries/products")
public class ProductsController {
    private final Gson gson;

    public ProductsController() {
        this.gson = new Gson();
    }

    @GetMapping("/")
    public String getProducts() {
        List<ProductsModel> products = new ArrayList<ProductsModel>();
        products.add(new ProductsModel(UUID.randomUUID(), "Coca", 12.0, 18.0, "Bebidas", "Coke"));
        products.add(new ProductsModel(UUID.randomUUID(), "Fuze-tea", 18.0, 20.0, "Bebidas", "Coke"));
        products.add(new ProductsModel(UUID.randomUUID(), "Sabritas", 16.0, 20.0, "Comestibles", "Sabritas"));
        products.add(new ProductsModel(UUID.randomUUID(), "Takis", 14.0, 18.0, "Comestibles", "Varcel"));
        products.add(new ProductsModel(UUID.randomUUID(), "Donitas", 12.0, 21.0, "Comestibles", "Bimbo"));
        
        String jsonProducts = gson.toJson(products);

        return jsonProducts;
    }
}
