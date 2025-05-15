import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidadorHorasConexionSeguro {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            System.out.print("Total de horas conectadas: ");
            int horas = scanner.nextInt();

            System.out.print("Número de días laborales: ");
            int dias = scanner.nextInt();

            int promedio = horas / dias; // Posible división por cero
            System.out.println("Promedio de horas por día: " + promedio);

        } catch (InputMismatchException e) {
            System.out.println("❌ Error: Debes ingresar un número entero válido.");
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: No puedes dividir entre cero.");
        } catch (Exception e) {
            System.out.println("❌ Error inesperado: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close(); // Gestión adecuada del recurso
                System.out.println("📦 Recurso liberado correctamente.");
            }
        }
    }
}