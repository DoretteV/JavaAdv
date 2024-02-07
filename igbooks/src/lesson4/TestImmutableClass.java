package lesson4;

//public class TestImmutableClass extends Contacts{     //cannot extend immutable class
    public class TestImmutableClass {
    public static void main(String[] args) {
        Contacts c = new Contacts("Sheryl", "Dreyer");
        System.out.println(c);

    }
}
