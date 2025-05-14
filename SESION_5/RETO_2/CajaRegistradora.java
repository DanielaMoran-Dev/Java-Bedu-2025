public class CajaRegistradora {
    public static void main(String[] args) {
        // Crear instancias de pagos
        MetodoPago[] pagos = new MetodoPago[] {
            new PagoEfectivo(150.0),
            new PagoTarjeta(320.0),
            new PagoTransferencia(500.0)
        };

        // Procesar cada pago
        for (MetodoPago pago : pagos) {
            if (pago instanceof Autenticable autenticable) {
                if (autenticable.autenticar()) {
                    pago.procesarPago();
                    pago.mostrarResumen();
                } else {
                    System.out.println("❌ Pago fallido.");
                }
            }
        }
    }
}
