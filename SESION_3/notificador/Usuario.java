package notificador;

import java.util.Optional;

public class Usuario {

    private String nombre;
    private Optional<String> email;
    private Optional<String> telefono;
    private Notificacion notificacion;

    public Usuario(String nombre, Optional<String> email, Optional<String> telefono, Notificacion notificacion) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.notificacion = notificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public Optional<String> getTelefono() {
        return telefono;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }
}
