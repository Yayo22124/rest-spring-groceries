package com.haziel.groceries.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeesModel {
    private UUID id_employee;
    private String name;
    private String first_lastname;
    private String second_lastname;
    private String hours;
    private String job;
}
