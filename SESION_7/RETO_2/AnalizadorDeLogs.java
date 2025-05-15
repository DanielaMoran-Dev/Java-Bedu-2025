import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        String nombreArchivo = "errores.log";
        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarnings = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    totalErrores++;
                }
                if (linea.contains("WARNING")) {
                    totalWarnings++;
                }
            }

            // Calcular porcentajes
            double porcentajeErrores = (totalErrores * 100.0) / totalLineas;
            double porcentajeWarnings = (totalWarnings * 100.0) / totalLineas;

            // Mostrar resumen
            System.out.println("Resumen del análisis:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores (ERROR): " + totalErrores);
            System.out.println("Cantidad de advertencias (WARNING): " + totalWarnings);
            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            guardarErrorEnLog(e.getMessage());
        }
    }

    public static void guardarErrorEnLog(String mensaje) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("registro_fallos.txt", true))) {
            bw.write("Error al procesar archivo: " + mensaje);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("También falló al escribir en registro_fallos.txt: " + e.getMessage());
        }
    }
}
