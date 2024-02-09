package lesson10;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestTerminalOperators {

    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        System.out.println("\n--- Executive Count ---");
        long execCount =
                eList.stream()
                        .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                        .count();
        System.out.println("Number of Executives are " + execCount);

        System.out.println("\n--- Highest Paid Exec ---");
        Optional highestExec =
                eList.stream()
                        .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                        .max(Employee::sortBySalary);

        if(highestExec.isPresent()){
            Employee temp = (Employee) highestExec.get();
            System.out.printf("\nName: " + temp.getGivenName() + " " + temp.getSurName() + "\nSalary: $%,6.2f %n ", temp.getSalary());
        }

        System.out.println("\n--- Lowest Paid Executive ---");
        Optional lowestStaff =
                eList.stream()
                        .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                        .min(Comparator.comparingDouble(e -> e.getSalary()));

        if(lowestStaff.isPresent()){
            Employee temp2 = (Employee) lowestStaff.get();
            System.out.printf("\nName: " + temp2.getGivenName() + " " + temp2.getSurName() + "\nSalary: $%,6.2f %n ", temp2.getSalary());
        }
    }
}
