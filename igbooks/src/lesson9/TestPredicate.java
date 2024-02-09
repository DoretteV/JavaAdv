package lesson9;

import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();

        Predicate<SalesTxn> massSales = t -> t.getState().equals(State.MA); //Predicate gets passed an object and returns a boolean

        System.out.println("\n--- Sales - Stream ---");
        tList.stream()
                .filter(massSales)
                .forEach(t -> t.printSummary());
    }
}
