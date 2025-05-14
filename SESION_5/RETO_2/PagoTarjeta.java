public class PagoTarjeta extends MetodoPago implements Autenticable {
    public PagoTarjeta(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        // Simulación de validación de fondos
        System.out.println("✅ Autenticación exitosa.");
        return true; // En un caso real, se validaría si hay fondos suficientes
    }

    @Override
    public void procesarPago() {
        System.out.println("💳 Procesando pago con tarjeta por $" + monto);
    }
}
