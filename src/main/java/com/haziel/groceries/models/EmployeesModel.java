package com.haziel.groceries.models;

import java.util.UUID;

public class EmployeesModel {
    private UUID id_employee;
    private String name;
    private String first_lastname;
    private String second_lastname;
    private String hours;
    private String job;
    
    

    public EmployeesModel(UUID id_employee, String name, String first_lastname, String second_lastname, String hours,
            String job) {
        this.id_employee = id_employee;
        this.name = name;
        this.first_lastname = first_lastname;
        this.second_lastname = second_lastname;
        this.hours = hours;
        this.job = job;
    }
    
    public UUID getId_employee() {
        return id_employee;
    }
    public void setId_employee(UUID id_employee) {
        this.id_employee = id_employee;
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
    public String getHours() {
        return hours;
    }
    public void setHours(String hours) {
        this.hours = hours;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    
}
