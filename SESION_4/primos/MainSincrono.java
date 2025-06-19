package primos;

import java.util.List;
import java.util.Scanner;

public class MainSincrono {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n¿Cuántos números primos quieres calcular?");
            int cantidad = sc.nextInt();
            sc.nextLine();

            System.out.println("Calculando " + cantidad + " primos...");

            try {
                List<Long> primos = CalculadoraPrimos.calcularPrimerosPrimos(cantidad);
                ManejoArchivos.escribir(primos);
                System.out.println("Cálculo terminado.");
            } catch (Exception ex) {
                System.out.println("Error durante el cálculo.");
            }

            System.out.println("\n¿Quieres seguir calculando? (Y/N)");
            if (!sc.nextLine().trim().equalsIgnoreCase("y")) break;
        }

        sc.close();
        System.out.println("\nTerminando programa...");
    }
}
