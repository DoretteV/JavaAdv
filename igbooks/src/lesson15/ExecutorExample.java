package lesson15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorExample {

    public static void main(String[] args) {
        //running in parallel
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.execute(new ExampleRunnable("one"));
        es.execute(new ExampleRunnable("two"));
        //stop the execution you need to shutdown
        es.shutdown();
    }
}
