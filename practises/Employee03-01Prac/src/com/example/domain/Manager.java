/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author pierr
 */
//
public class Manager extends Employee {
    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        //inherit from the parent class by using super
        //manager constructor calls the employee constructor by using the keyword super
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
