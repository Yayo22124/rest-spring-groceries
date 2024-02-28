package com.haziel.groceries.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.haziel.groceries.models.CustomersModel;
import com.haziel.groceries.models.EmployeesModel;

@RestController
@RequestMapping("/groceries/employees")
public class EmployeesController {
    private final Gson gson;

    public EmployeesController() {
        this.gson = new Gson();
    }

    @GetMapping("/")
    public String getEmployees() {
        List<EmployeesModel> employees = new ArrayList<EmployeesModel>();
        employees.add(new EmployeesModel(UUID.randomUUID(), "Esteban", "Fajardo", "Islas", "10-7", "Encargado de Salchichoneria"));
        employees.add(new EmployeesModel(UUID.randomUUID(), "Orneando", "Briones", "Arroyo", "4-12", "Gerente"));
        employees.add(new EmployeesModel(UUID.randomUUID(), "Felipe", "Gonzalez", "Romero", "8-12", "Lider de negocios"));
        employees.add(new EmployeesModel(UUID.randomUUID(), "Ivan", "Morales", "Dominguez", "9-9", "Marketing"));
        employees.add(new EmployeesModel(UUID.randomUUID(), "Juan", "Méndez", "Gómez", "12-12", "Desarrollador"));
        
        String jsonEmployees = gson.toJson(employees);

        return jsonEmployees;
    }
}
