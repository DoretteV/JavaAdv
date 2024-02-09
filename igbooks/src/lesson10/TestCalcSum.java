package lesson10;

import java.util.List;

public class TestCalcSum {

    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        System.out.println("\n--- Total CO Bonus ---");

        double result = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .sum();

        System.out.printf("Total Bonus paid: $%,6.2f %n", result);

        System.out.println("\n--- Total CO Bonus Details ---");

        double result2 = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .peek(e -> System.out.print("Name: " + e.getGivenName() + " Surname: " + e.getSurName()))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .peek(e -> System.out.printf("\nBonus: $%,6.2f %n", e))
                .sum();

        System.out.printf("Total Bonus paid: $%,6.2f %n", result);
    }
}
