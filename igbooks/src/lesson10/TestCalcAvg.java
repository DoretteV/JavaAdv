package lesson10;

import java.util.List;
import java.util.OptionalDouble;

public class TestCalcAvg {

    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        System.out.println("\n--- Average CO Bonus ---");

        OptionalDouble result = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .peek(e -> System.out.print("Name: " + e.getGivenName() + " " + e.getSurName() + " "))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .peek(e -> System.out.printf("\nBonus paid: $%,6.2f %n", e))
                .average();

            System.out.printf("Average Bonus paid: $%,6.2f %n", result.getAsDouble());
        }


    }
