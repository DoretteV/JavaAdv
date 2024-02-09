package lesson9;

import java.util.function.DoubleFunction;

public class TestDoubleFunction {
    public static void main(String[] args) {
        //converts to a string
        DoubleFunction<String> calc = t -> String.valueOf(t * 3);
        String result = calc.apply(20);
        System.out.println("New value is: " + result);
    }
}