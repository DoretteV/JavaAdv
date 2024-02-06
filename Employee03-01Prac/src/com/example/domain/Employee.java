package com.example.domain;

import java.text.NumberFormat;

public class Employee {
    //employee fields are made private
    private int empId;
    private String name;
    private String ssn;
    private double salary;
    //constructor
    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //prevent a null or empty value
        if(name != null && !name.equals("")){
        this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getSsn() {
        return ssn;
    }
    //raise salary method
    public void raiseSalary(double increase) {
        //prevent a negative value 
        if(increase > 0){
        salary += increase;
        }
    }
    //print employee method
    public void printEmployee() {
        System.out.println();
        
        System.out.println("Employee is: " + getEmpId());
        System.out.println("Employee name: " + getName());
        System.out.println("Employee Soc Sec #: " + getSsn());
        System.out.println("Employee salary: " + NumberFormat.getCurrencyInstance().format((double)getSalary()));
    }

}
