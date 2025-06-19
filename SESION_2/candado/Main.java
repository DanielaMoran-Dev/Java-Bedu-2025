package candado;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ExecutorService gestor = Executors.newFixedThreadPool(3);
        gestor.submit(new Incrementador());
        gestor.submit(new Incrementador());
        gestor.submit(new Incrementador());
        gestor.shutdown();
        try {
            gestor.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            System.out.println("Interrumpido.");
        }
        System.out.println("Candado Valor final: " + MemoriaCompartida.valor);
    }
}
