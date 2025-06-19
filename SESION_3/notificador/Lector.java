package notificador;

import java.io.*;
import java.util.*;

public class Lector {

    public static List<Usuario> leerArchivo() {
        List<Usuario> usuarios = new LinkedList<>();

        try (BufferedReader buffer = new BufferedReader(new FileReader("../notificador/cobranza.txt"))) {
            String linea;
            int lineaActual = 1;

            while ((linea = buffer.readLine()) != null) {
                String[] entradas = linea.split("\\|");

                if (entradas.length < 4) {
                    System.out.println("Línea incompleta: " + lineaActual);
                    continue;
                }

                String nombre = entradas[0].trim();
                Optional<String> email = entradas[1].isEmpty() ? Optional.empty() : Optional.of(entradas[1]);
                Optional<String> telefono = entradas[2].isEmpty() ? Optional.empty() : Optional.of(entradas[2]);
                Notificacion notificacion = entradas[3].equalsIgnoreCase("EMAIL") ? Notificacion.EMAIL : Notificacion.TELEFONO;

                usuarios.add(new Usuario(nombre, email, telefono, notificacion));
                lineaActual++;
            }

        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }

        return usuarios;
    }
}
