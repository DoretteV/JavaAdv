package com.example.lambda;

import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author oracle
 */
public class FunctionTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    //todoublefunction lambda expression
    ToDoubleFunction<Employee> eFunc =
           e -> e.getSalary() * Bonus.byRole(e.getRole()); // Write your function lambda here
      
    System.out.println("=== First Employee Bonus");
    first.printSummary();
    //lambda expression on the first variable
    System.out.println("Bonus: " + eFunc.applyAsDouble(first) ); // Print the result here
        
  }
}
