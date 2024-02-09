package lesson8;

import java.util.List;
import java.util.function.Predicate;

public class A03aMethodReference {
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        //Save predicate to a variable
        Predicate<SalesTxn> cal = t -> t.getState().equals(State.CA);

        System.out.println("\n--- CA Transaction Lambda ---");

//        tList.stream()
//                .filter(t -> t.getState().equals(State.CA))
//                .forEach(t -> t.printSummary());

        tList.stream()
                .filter(cal)
                .forEach(SalesTxn::printSummary);
    }
}

