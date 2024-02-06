package lesson4;

public class TestOverriding {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Sue", "123-159-123", 10000.00);
        Manager manager = new Manager(2, "Dave", "567-159-128", 20000.00, "Marketing");
        System.out.println(emp.getAllDetails());
        System.out.println(manager.getAllDetails());
    }
}
