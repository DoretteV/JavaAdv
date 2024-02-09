package lesson10;

import java.util.List;
import java.util.OptionalDouble;

public class TestSortBonus {

    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        System.out.println("\n--- CO Bonus Details ---");

        eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .peek(e -> System.out.print("Name: " + e.getGivenName() + " " + e.getSurName() + " "))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .peek(e -> System.out.printf("\nBonus paid: $%,6.2f %n", e))
                .sorted()
                        .forEach(e -> System.out.printf("Sorted Bonus paid: $%,6.2f %n", e));
    }
}
