public class PagoEfectivo extends MetodoPago implements Autenticable {
    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        // Pago efectivo no requiere validación, siempre es auténtico
        System.out.println("✅ Autenticación exitosa.");
        return true;
    }

    @Override
    public void procesarPago() {
        System.out.println("💵 Procesando pago en efectivo por $" + monto);
    }
}
