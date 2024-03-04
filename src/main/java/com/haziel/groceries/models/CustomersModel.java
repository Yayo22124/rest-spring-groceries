package com.haziel.groceries.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomersModel {
    private UUID id_customer;
    private String name;
    private String first_lastname;
    private String second_lastname;
    private String address;
    private String telephone;
}
