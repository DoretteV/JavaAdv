package lesson5;


public class TestFinalObjectReference {
    public static void main(String[] args) {
        final Employee emp1 = new Employee(1, "Sue", "123-159-123", 10000.00);
        Employee emp2 = new Employee(1, "Sue", "123-159-123", 10000.00);
        emp1.setEmpId(100);     //can change values but
        //emp1 = emp2; cannot change reference to a different object because emp1 is final
    }
}
