package com.haziel.groceries.models;

import java.util.UUID;

public class CustomersModel {
    private UUID id_customer;
    private String name;
    private String first_lastname;
    private String second_lastname;
    private String address;
    private String telephone;
    
    public CustomersModel(UUID id_customer, String name, String first_lastname, String second_lastname, String address,
            String telephone) {
        this.id_customer = id_customer;
        this.name = name;
        this.first_lastname = first_lastname;
        this.second_lastname = second_lastname;
        this.address = address;
        this.telephone = telephone;
    }

    public UUID getId_customer() {
        return id_customer;
    }
    public void setId_customer(UUID id_customer) {
        this.id_customer = id_customer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFirst_lastname() {
        return first_lastname;
    }
    public void setFirst_lastname(String first_lastname) {
        this.first_lastname = first_lastname;
    }
    public String getSecond_lastname() {
        return second_lastname;
    }
    public void setSecond_lastname(String second_lastname) {
        this.second_lastname = second_lastname;
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
