package lesson4;

public class TestVarargs {
    public static void main(String[] args) {
        float total = Statistics.average(2, 400, 56, 78, 9);    //can also pass a 0
        System.out.println(total);
    }
}
