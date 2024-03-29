package lesson7;

import java.util.ArrayDeque;
import java.util.Deque;


public class TestStack {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");

        int size = stack.size();
        while (stack.size() > 0) {
            System.out.println(stack.pop());
            size--;
        }
    }
}
