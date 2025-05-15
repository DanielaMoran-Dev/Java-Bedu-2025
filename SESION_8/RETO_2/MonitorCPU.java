import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> consumosUnicos = new HashSet<>();

        try {
            System.out.println("Inicia el monitoreo de CPU.");
            System.out.println("Ingresa el consumo de CPU (en %), escribe -1 para finalizar:");

            while (true) {
                System.out.print(">> ");
                String entrada = scanner.nextLine();

                if (entrada.equals("-1")) {
                    break;
                }

                int consumo;

                // Validar si es número
                try {
                    consumo = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingresa un valor numérico válido.");
                    continue;
                }

                // Validar rango
                if (consumo < 0 || consumo > 100) {
                    System.out.println("Error: El valor debe estar entre 0 y 100.");
                    continue;
                }

                // Validar duplicado
                if (!consumosUnicos.add(consumo)) {
                    System.out.println("Error: Valor duplicado. Ya fue registrado.");
                    continue;
                }

                // Validar consumo crítico
                if (consumo > 95) {
                    throw new ConsumoCriticoException("Alerta crítica: CPU al " + consumo + "%");
                }

                System.out.println("Registro aceptado.");
            }

            System.out.println("Monitoreo finalizado correctamente.");
            System.out.println("Valores registrados: " + consumosUnicos);

        } catch (ConsumoCriticoException e) {
            System.out.println("Excepción detectada: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("🔚 Recurso cerrado.");
        }
    }
}
