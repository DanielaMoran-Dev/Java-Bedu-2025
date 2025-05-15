import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExploradorArchivos {
    public static void main(String[] args) {
        Path rutaArchivo = Paths.get("src/Ejemplo_01/ejemplo.txt");

        System.out.println("Ruta absoluta: " + rutaArchivo.toAbsolutePath());

        if (Files.exists(rutaArchivo)) {
            System.out.println("El archivo existe.");
        } else {
            System.out.println("El archivo NO existe.");
        }

        if (Files.isDirectory(rutaArchivo)) {
            System.out.println("Es un directorio.");
        } else {
            System.out.println("Es un archivo.");
        }

        System.out.println("¿Se puede leer?: " + Files.isReadable(rutaArchivo));
        System.out.println("¿Se puede escribir?: " + Files.isWritable(rutaArchivo));
    }
}