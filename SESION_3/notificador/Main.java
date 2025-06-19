package notificador;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Leyendo usuarios desde archivo...");
        List<Usuario> usuarios = Lector.leerArchivo();
        System.out.println("Total usuarios cargados: " + usuarios.size());

        Predicate<Usuario> notificarPorEmail = (u) -> u.getNotificacion() == Notificacion.EMAIL;
        Predicate<Usuario> notificarPorTelefono = (u) -> u.getNotificacion() == Notificacion.TELEFONO;

        List<Usuario> viaEmail = usuarios.stream().filter(notificarPorEmail).collect(Collectors.toList());
        List<Usuario> viaTelefono = usuarios.stream().filter(notificarPorTelefono).collect(Collectors.toList());

        Function<Usuario, String> imprimirEmail = (u) ->
            "Enviando correo a " + u.getNombre() + " → " + u.getEmail().orElse("Sin email");

        Function<Usuario, String> imprimirTelefono = (u) ->
            "Llamando a " + u.getNombre() + " → " + u.getTelefono().orElse("Sin teléfono");

        System.out.println("\nNotificaciones por EMAIL:");
        viaEmail.stream().map(imprimirEmail).forEach(System.out::println);

        System.out.println("\nNotificaciones por TELÉFONO:");
        viaTelefono.stream().map(imprimirTelefono).forEach(System.out::println);
    }
}
