import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class GestorDeReportes {
    public static void main(String[] args) {
        try {
            Path base = Paths.get("src/Ejemplo_03");
            Path dirTemporal = base.resolve("temporal");
            Path dirAlmacenamiento = base.resolve("almacenamiento");
            Path dirRespaldo = base.resolve("respaldo");
            Path dirHistoricos = base.resolve("archivos-historicos");

            Files.createDirectories(dirTemporal);
            Files.createDirectories(dirAlmacenamiento);
            Files.createDirectories(dirRespaldo);
            Files.createDirectories(dirHistoricos);

            Path archivoTemporal = dirTemporal.resolve("reporte_inspeccion.txt");

            if (!Files.exists(archivoTemporal)) {
                Files.writeString(archivoTemporal, "Reporte de inspección inicial.\nFecha: 2025-03-31", StandardCharsets.UTF_8);
                System.out.println("Archivo de reporte creado en carpeta temporal.");
            }

            Path archivoAlmacenado = dirAlmacenamiento.resolve("reporte_inspeccion.txt");
            Files.move(archivoTemporal, archivoAlmacenado, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo movido a carpeta de almacenamiento.");

            Path archivoRespaldo = dirRespaldo.resolve("reporte_inspeccion.txt");
            Files.copy(archivoAlmacenado, archivoRespaldo, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copia de respaldo creada.");

            System.out.println("¿Se puede leer?: " + Files.isReadable(archivoRespaldo));
            System.out.println("¿Se puede escribir?: " + Files.isWritable(archivoRespaldo));

        } catch (IOException e) {
            System.err.println("Error al manejar archivos: " + e.getMessage());
        }
    }
}