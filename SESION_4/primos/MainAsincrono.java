package primos;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class MainAsincrono {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n¿Cuántos números primos quieres calcular?");
            int cantidad = sc.nextInt();
            sc.nextLine();

            CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("Calculando " + cantidad + " primos...");
                    return CalculadoraPrimos.calcularPrimerosPrimos(cantidad);
                })
                .thenAccept(ManejoArchivos::escribir)
                .thenRun(() -> System.out.println("Cálculo asíncrono terminado."))
                .exceptionally(error -> {
                    System.out.println("Error inesperado: " + error.getMessage());
                    return null;
                });

            System.out.println("\n¿Quieres seguir calculando? (Y/N)");
            if (!sc.nextLine().trim().equalsIgnoreCase("y")) break;
        }

        sc.close();
        System.out.println("\nTerminando programa...");
    }
}
