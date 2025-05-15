import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Crear el objeto
            Paciente paciente = new Paciente();

            // Pedir y asignar valores
            System.out.print("Nombre del paciente: ");
            paciente.nombre = scanner.nextLine();

            System.out.print("Edad del paciente: ");
            paciente.edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.print("Número de expediente: ");
            paciente.num = scanner.nextLine();

            // Mostrar la información
            System.out.println("\nInformación del paciente:");
            paciente.Info();
        }
    }
}
