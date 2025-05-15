public abstract class MetodoPago {
    protected double monto;

    // Constructor
    public MetodoPago(double monto) {
        this.monto = monto;
    }

    // Método abstracto para procesar el pago
    public abstract void procesarPago();

    // Método concreto para mostrar el resumen del pago
    public void mostrarResumen() {
        System.out.println("Tipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }
}
