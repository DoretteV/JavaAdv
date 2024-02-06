/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author pierr
 */
public class Director extends Manager{
    
    private double budget; 
    
    public Director(int empId, String name, String ssn, double salary, String department, double budget){
        super(empId, name, ssn, salary, department);
        this.budget = budget;
    }

    /**
     * @return the budget
     */
    public double getBudget() {
        return budget;
    }
    
}
