package com.haziel.groceries.models;

import java.util.UUID;

public class SuppliersModel {
    private UUID id_provider;
    private String name;
    private String hours;
    private String business;
    private String address;
    private String telephone;

    
    
    public SuppliersModel(UUID id_provider, String name, String hours, String business, String address,
            String telephone) {
        this.id_provider = id_provider;
        this.name = name;
        this.hours = hours;
        this.business = business;
        this.address = address;
        this.telephone = telephone;
    }
    public UUID getId_provider() {
        return id_provider;
    }
    public void setId_provider(UUID id_provider) {
        this.id_provider = id_provider;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHours() {
        return hours;
    }
    public void setHours(String hours) {
        this.hours = hours;
    }
    public String getBusiness() {
        return business;
    }
    public void setBusiness(String business) {
        this.business = business;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    
}
