package lesson4;

import static java.lang.Math.*;

public class TestStaticImport {
    public static void main(String[] args) {
        System.out.println("Random " + random());
        System.out.println("Square root " + sqrt(9.00));
        System.out.println("Round " + round(random() * 100));
        System.out.println("Absolute " + abs(9));
    }
}
