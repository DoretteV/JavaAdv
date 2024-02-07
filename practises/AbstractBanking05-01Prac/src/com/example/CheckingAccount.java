/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author pierr
 */
public class CheckingAccount extends Account{
    
    private final double overDraftLimit;
    
    //constructor
    public CheckingAccount(double balance, double overDraftLimit){
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }
    
    //constructor with one parameter
    public CheckingAccount(double balance) {
        this(balance, 0);
    }
    
    @Override
    public String getDescription(){
        return "Checking Account";
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance + overDraftLimit) {
            balance -= amount;
            return true;
        }else {
            return false;
        }
    }
    
}
