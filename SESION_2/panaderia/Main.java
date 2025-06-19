package panaderia;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(new Panadero());
        executor.submit(new Panadero());
        executor.submit(new Panadero());

        executor.shutdown();
        try {
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {}

        System.out.println("🍽️ Panes horneados: " + Panaderia.canasta.size());
        System.out.println("Ejemplo: " + Panaderia.canasta);
    }
}
