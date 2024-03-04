package com.haziel.groceries.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsModel {
    private UUID id_product;
    private String name;
    private Double cost;
    private Double price;
    private String category;
    private String provider;
}
