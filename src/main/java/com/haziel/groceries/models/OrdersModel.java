package com.haziel.groceries.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersModel {
    private UUID id_order;
    private UUID id_customer;
    private UUID id_product;
    private String date;
}
