public class TicketSoporte {

    // Atributos de instancia
    private String titulo;
    private String categoria;
    private int prioridad; // 1: Alta, 2: Media, 3: Baja
    private boolean estaActivo;

    // Constructor por defecto
    public TicketSoporte() {
        this.titulo = "Sin título";
        this.categoria = "General";
        this.prioridad = 2;
        this.estaActivo = true;
    }

    // Constructor con parámetros
    public TicketSoporte(String titulo, String categoria, int prioridad) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.estaActivo = true;
    }

    // Constructor de copia
    public TicketSoporte(TicketSoporte otro) {
        this.titulo = otro.titulo;
        this.categoria = otro.categoria;
        this.prioridad = otro.prioridad;
        this.estaActivo = otro.estaActivo;
    }

    // Constructor sobrecargado con solo título
    public TicketSoporte(String titulo) {
        this.titulo = titulo;
        this.categoria = "Sin categoría";
        this.prioridad = 3; // Baja
        this.estaActivo = true;
    }

    public TicketSoporte(String categoria, boolean estaActivo, int prioridad, String titulo) {
        this.categoria = categoria;
        this.estaActivo = estaActivo;
        this.prioridad = prioridad;
        this.titulo = titulo;
    }

    // Método para mostrar la información del ticket
    public void mostrarInfo() {
        System.out.println("🎫 Ticket: " + titulo);
        System.out.println("📂 Categoría: " + categoria);
        System.out.println("⚠️ Prioridad: " + prioridad);
        System.out.println("📌 Estado: " + (estaActivo ? "Activo" : "Cerrado"));
    }

    // Método para cerrar el ticket
    public void cerrar() {
        estaActivo = false;
        System.out.println("🔒 El ticket '" + titulo + "' ha sido cerrado.");
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}