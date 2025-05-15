public abstract class Principal {
    protected String nombre;

    // Constructor
    public Principal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para responder
    public abstract void responder();

    // Método concreto para activar la unidad
    public void activarUnidad() {
        System.out.println("Activando unidad: " + nombre);
    }
}
