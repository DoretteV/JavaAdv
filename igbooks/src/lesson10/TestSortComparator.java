package lesson10;

import java.util.Comparator;
import java.util.List;

public class TestSortComparator {

    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        System.out.println("\n--- Sorting by Surname ---");

        eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .sorted(Comparator.comparing(Employee::getSurName))
                .forEach(Employee::printSummary);

        System.out.println("\n--- Sorting Surname Reversed ---");

        eList.stream()
//                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
//                .filter(e -> e.getState().equals("CO"))
                .sorted(Comparator.comparing(Employee::getSurName).reversed())
                .forEach(Employee::printSummary);

        System.out.println("\n--- Sorting Surname within Department ---");

        eList.stream()
                .sorted(Comparator.comparing(Employee::getDept).thenComparing(Employee::getDept))
                .forEach(e -> System.out.println("Department: " + e.getDept() + " Surname " + e.getSurName() + " Name: " + e.getGivenName()));

    }
}
