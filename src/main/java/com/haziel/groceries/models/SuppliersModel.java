package com.haziel.groceries.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuppliersModel {
    private UUID id_provider;
    private String name;
    private String hours;
    private String business;
    private String address;
    private String telephone;
}
