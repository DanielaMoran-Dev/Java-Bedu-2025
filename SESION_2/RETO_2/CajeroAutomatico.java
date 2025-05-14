import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            var saldo = 1000.0;
            int opcion;
            
            do {
                System.out.println("\nBienvenido al cajero automático");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Depositar dinero");
                System.out.println("3. Retirar dinero");
                System.out.println("4. Salir");
                System.out.print("Elige una opción: ");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> System.out.println("Tu saldo actual es: $" + saldo);
                        
                    case 2 -> {
                        System.out.print("Ingresa el monto a depositar: ");
                        double deposito = scanner.nextDouble();
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                    }
                        
                    case 3 -> {
                        System.out.print("Ingresa el monto a retirar: ");
                        double retiro = scanner.nextDouble();
                        
                        if (retiro > saldo) {
                            System.out.println("Saldo insuficiente. Tu saldo es: $" + saldo);
                            continue; // regresa al menú sin restar nada
                        }
                        
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    }
                        
                    case 4 -> System.out.println("Gracias por usar el cajero automático. ¡Hasta pronto!");
                        
                    default -> {
                        System.out.println("Opción no válida. Intenta de nuevo.");
                    }

                }
                
            } while (opcion != 4);
        }
    }
}
