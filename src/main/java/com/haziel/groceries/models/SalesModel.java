package com.haziel.groceries.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesModel {
    private UUID id_sale;
    private String sold_date;
    private UUID id_employee;
    private UUID id_customer;
    private Double price;
    private String provider;
}
