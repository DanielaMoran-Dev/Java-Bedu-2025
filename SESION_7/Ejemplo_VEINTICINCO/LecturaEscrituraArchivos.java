import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LecturaEscrituraArchivos {
    public static void main(String[] args) {
        Path ruta = Paths.get("src/Ejemplo_02/notas.txt");

        String contenido = "Este es un archivo de prueba.\nAquí aprendemos a escribir y leer en Java.";

        try {
            Files.write(ruta, contenido.getBytes());
            System.out.println("Archivo escrito exitosamente.");

            String textoLeido = Files.readString(ruta);
            System.out.println("Contenido leído:");
            System.out.println(textoLeido);

        } catch (IOException e) {
            System.out.println("Error al trabajar con el archivo: " + e.getMessage());
        }
    }
}