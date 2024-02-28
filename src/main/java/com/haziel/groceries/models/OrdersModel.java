package com.haziel.groceries.models;

import java.util.UUID;

public class OrdersModel {
    private UUID id_order;
    private UUID id_customer;
    private UUID id_product;
    private String date;
    
    
    public OrdersModel(UUID id_order, UUID id_customer, UUID id_product, String date) {
        this.id_order = id_order;
        this.id_customer = id_customer;
        this.id_product = id_product;
        this.date = date;
    }
    
    public UUID getId_order() {
        return id_order;
    }
    public void setId_order(UUID id_order) {
        this.id_order = id_order;
    }
    public UUID getId_customer() {
        return id_customer;
    }
    public void setId_customer(UUID id_customer) {
        this.id_customer = id_customer;
    }
    public UUID getId_product() {
        return id_product;
    }
    public void setId_product(UUID id_product) {
        this.id_product = id_product;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    
}
