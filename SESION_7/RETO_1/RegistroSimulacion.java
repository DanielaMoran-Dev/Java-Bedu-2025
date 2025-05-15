import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {
        guardarParametros();
        leerParametros();
    }

    public static void guardarParametros() {
        // Ruta al archivo
        Path rutaCarpeta = Paths.get("config");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        // Contenido a guardar
        String contenido = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

        try {
            // Crear carpeta si no existe
            if (!Files.exists(rutaCarpeta)) {
                Files.createDirectory(rutaCarpeta);
                System.out.println("Carpeta 'config' creada.");
            }

            // Escribir contenido en el archivo
            Files.write(rutaArchivo, contenido.getBytes());
            System.out.println("Archivo 'parametros.txt' guardado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar los parámetros: " + e.getMessage());
        }
    }

    public static void leerParametros() {
        Path rutaArchivo = Paths.get("config", "parametros.txt");

        // Verificar si existe
        if (Files.exists(rutaArchivo)) {
            try {
                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println("\nContenido del archivo:");
                System.out.println(contenidoLeido);
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo 'parametros.txt' no existe.");
        }
    }
}
