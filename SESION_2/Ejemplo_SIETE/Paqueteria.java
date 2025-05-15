import java.util.Scanner;

public class Paqueteria { 
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce el tipo de paquete (pequeño, mediano, grande): ");
            String tipo = scanner.nextLine().trim();
            
            double costo;
            
            if (tipo.equalsIgnoreCase("pequeño")) {
                costo = 49.99;
            } else if (tipo.equalsIgnoreCase("mediano")) {
                costo = 89.99;
            } else if (tipo.equalsIgnoreCase("grande")) {
                costo = 149.99;
            } else {
                System.out.println("Tipo de paquete no válido.");
                scanner.close();
                return;
            } 
            
            System.out.println("Costo del envío: $" + costo);
        }
    }
}
