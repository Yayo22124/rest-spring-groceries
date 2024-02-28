package com.haziel.groceries.models;

import java.util.UUID;

public class SalesModel {
    private UUID id_sale;
    private String sold_date;
    private UUID id_employee;
    private UUID id_customer;
    private Double price;
    private String provider;

    
    
    public SalesModel(UUID id_sale, String sold_date, UUID id_employee, UUID id_customer, Double price,
            String provider) {
        this.id_sale = id_sale;
        this.sold_date = sold_date;
        this.id_employee = id_employee;
        this.id_customer = id_customer;
        this.price = price;
        this.provider = provider;
    }
    public UUID getId_sale() {
        return id_sale;
    }
    public void setId_sale(UUID id_sale) {
        this.id_sale = id_sale;
    }
    public String getSold_date() {
        return sold_date;
    }
    public void setSold_date(String sold_date) {
        this.sold_date = sold_date;
    }
    public UUID getId_employee() {
        return id_employee;
    }
    public void setId_employee(UUID id_employee) {
        this.id_employee = id_employee;
    }
    public UUID getId_customer() {
        return id_customer;
    }
    public void setId_customer(UUID id_customer) {
        this.id_customer = id_customer;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }

    
}
