package primos;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ManejoArchivos {

    public static void escribir(List<Long> numeros) {
        LocalDateTime ahora = LocalDateTime.now();
        String timestamp = ahora.format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        File archivo = new File("../primos/resultado_" + timestamp + ".txt");

        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo))) {
            buffer.write("Lista de primos:\n");
            buffer.write(numeros.toString());
            System.out.println("Resultado guardado en: " + archivo.getName());
        } catch (IOException ex) {
            System.out.println("Error al escribir el archivo.");
        }
    }
}
