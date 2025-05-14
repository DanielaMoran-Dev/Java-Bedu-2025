public class Proyecto {

    private final String nombre;
    private final String cliente;
    private final int duracionSemanas;
    private boolean estaActivo;

    public static int totalProyectos = 0;

    public static final String NOMBRE_SISTEMA = "GestorProyectos v1.0";

    public Proyecto(String nombre, String cliente, int duracionSemanas, boolean estaActivo) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.duracionSemanas = duracionSemanas;
        this.estaActivo = estaActivo;
        totalProyectos++; 
    }

    // Método para mostrar información del proyecto
    public void mostrarInformacion() {
        System.out.println("Proyecto: " + nombre);
        System.out.println("Cliente: " + cliente);
        System.out.println("Duración: " + duracionSemanas + " semanas");
        System.out.println("¿Activo?: " + (estaActivo ? "Sí" : "No"));
    }

    public void cerrarProyecto() {
        estaActivo = false;
        System.out.println("🚫 El proyecto '" + nombre + "' ha sido cerrado.");
    }
}
