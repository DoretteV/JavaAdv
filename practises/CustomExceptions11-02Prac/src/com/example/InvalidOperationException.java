/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author pierr
 */
public class InvalidOperationException extends Exception{
    
    public InvalidOperationException(){
        //invoke the parent class constructor
        super();
    }
    
    public InvalidOperationException (String message) {
        super(message);
    }
    
    public InvalidOperationException(Throwable cause) {
        super(cause);
    }
    
    public InvalidOperationException(String message, Throwable cause){
        super(message, cause);
    }
    
}
