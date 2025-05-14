public abstract class UnidadEmergencia {
    protected String nombre;

    // Constructor
    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para responder
    public abstract void responder();

    // Método concreto para activar la unidad
    public void activarUnidad() {
        System.out.println("🚨 Activando unidad: " + nombre);
    }
}
