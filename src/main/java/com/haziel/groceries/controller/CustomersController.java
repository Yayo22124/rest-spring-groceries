package com.haziel.groceries.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.haziel.groceries.models.CustomersModel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/groceries/customers")
public class CustomersController {
    private final Gson gson;

    public CustomersController() {
        this.gson = new Gson();
    }

    @GetMapping("/")
    public String getCustomers() {
        List<CustomersModel> customers = new ArrayList<CustomersModel>();
        customers.add(new CustomersModel(UUID.randomUUID(), "Mariano", "Fajardo", "Islas", "Tabacal", "7641151920"));
        customers.add(new CustomersModel(UUID.randomUUID(), "Alejandro", "Briones", "Arroyo", "Xico", "22219204080"));
        customers.add(new CustomersModel(UUID.randomUUID(), "Alejandro", "Gonzalez", "Romero", "Huachinango", "7761202040"));
        customers.add(new CustomersModel(UUID.randomUUID(), "Irving", "Morales", "Dominguez", "Chignahuapan", "7761202040"));
        customers.add(new CustomersModel(UUID.randomUUID(), "Orlando", "Méndez", "Gómez", "Veracruz", "7761202040"));
        
        String jsonCustomers = gson.toJson(customers);

        return jsonCustomers;
    }
    

}
