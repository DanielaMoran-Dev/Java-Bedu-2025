import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        String contraseñaCorrecta = "admin123";
        String input;
        int intentos = 0;
        int maxIntentos = 2;

        try (Scanner scanner = new Scanner(System.in)) {
            while (intentos < maxIntentos) {
                System.out.print("Ingresa tu contraseña: ");
                input = scanner.nextLine();

                if (input.equals(contraseñaCorrecta)) {
                    System.out.println("Acceso concedido.");
                    break;
                } else {
                    System.out.println("Contraseña incorrecta.");
                    intentos++;
                }
            }

            if (intentos == maxIntentos) {
                System.out.println("Cuenta bloqueada por demasiados intentos.");
            }
        }
    }
}
