import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear el objeto
        Paciente paciente = new Paciente();

        // Pedir y asignar valores
        System.out.print("Nombre del paciente: ");
        paciente.nombre = scanner.nextLine();

        System.out.print("Edad del paciente: ");
        paciente.edad = scanner.nextInt();
        scanner.nextLine(); // Limpieza del buffer

        System.out.print("Numero de expediente: ");
        paciente.num = scanner.nextLine();

        // Mostrar la información
        System.out.println("\nInformacion del paciente");
        paciente.Info();

        scanner.close();
    }
}
