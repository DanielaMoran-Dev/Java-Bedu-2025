package facturas;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n¿Cuál es el código del ticket?");
                String codigo = sc.nextLine();
                
                System.out.println("¿Cuál es el total del ticket?");
                double total = sc.nextDouble();
                sc.nextLine(); // limpiar el buffer
                
                System.out.println("\nCreando factura del ticket " + codigo + "...");
                
                Sat.crearFactura(new Ticket(codigo, total))
                        .thenCompose(Sat::firmarFactura)
                        .thenAccept(facturaFirmada -> {
                            System.out.println("\nFactura generada exitosamente:");
                            System.out.println(facturaFirmada);
                        })
                        .thenRun(() -> System.out.println("\nFactura enviada al SAT.\n"));
                
                System.out.println("¿Quieres crear otra factura? (Y/N)");
                String continuar = sc.nextLine();
                if (!continuar.trim().equalsIgnoreCase("y")) break;
            }
        }
        System.out.println("\nTerminando programa...");
    }
}
