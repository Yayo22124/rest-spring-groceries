package com.haziel.groceries.models;

import java.util.UUID;

public class ProductsModel {
    private UUID id_product;
    private String name;
    private Double cost;
    private Double price;
    private String category;
    private String provider;

    
    
    public ProductsModel(UUID id_product, String name, Double cost, Double price, String category, String provider) {
        this.id_product = id_product;
        this.name = name;
        this.cost = cost;
        this.price = price;
        this.category = category;
        this.provider = provider;
    }
    
    public UUID getId_product() {
        return id_product;
    }
    public void setId_product(UUID id_product) {
        this.id_product = id_product;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }
    
    
    
}
