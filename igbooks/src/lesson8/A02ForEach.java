package lesson8;

import java.util.List;

public class A02ForEach {
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();

        System.out.println("\n--- Price List for each with Lambda ---");
        tList.forEach(t -> t.printSummary());

        tList.forEach(t -> System.out.println("ID: " + t.getTxnId() + "Buyer name: " + t.getBuyerName() + "Product: " + t.getProduct() + "Payment type: " + t.getPaymentType()));
        }
    }
