package lesson4;

public class TestEqualsOverride {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Sue", "123-159-123", 10000.00);
        Employee emp2 = new Employee(1, "Sue", "123-159-123", 10000.00);
        System.out.println(emp1.equals(emp2));

        emp2 = emp1;
        System.out.println(emp1.equals(emp2));
    }
}
