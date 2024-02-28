package com.haziel.groceries.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.haziel.groceries.models.SuppliersModel;
import com.haziel.groceries.models.SuppliersModel;

@RestController
@RequestMapping("/groceries/suppliers")
public class SuppliersController {
    private final Gson gson;

    public SuppliersController() {
        this.gson = new Gson();
    }

    @GetMapping("/")
    public String getSuppliers() {
        List<SuppliersModel> suppliers = new ArrayList<SuppliersModel>();
        suppliers.add(new SuppliersModel(UUID.randomUUID(), "Haziel", "12-10", "Coke", "Del Valle", "2221151920"));
        suppliers.add(new SuppliersModel(UUID.randomUUID(), "Salim", "10-7", "Bimbo", "Reforma Norte", "2221151929"));
        suppliers.add(new SuppliersModel(UUID.randomUUID(), "Amauri", "4-6", "Sabritas", "Miguel Hidalgo", "2223451920"));
        suppliers.add(new SuppliersModel(UUID.randomUUID(), "Alex", "6-9", "Varcel", "Venustiano Carranza", "2221192120"));
        suppliers.add(new SuppliersModel(UUID.randomUUID(), "Alina", "11-4", "Ciel", "Colonia Reforma", "2227151980"));
        
        String jsonSupliers = gson.toJson(suppliers);

        return jsonSupliers;
    }
}
