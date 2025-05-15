public class Principal {
    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[] {
            new PagoEfectivo(50.0),
            new PagoTarjeta(120.0),
            new PagoTransferencia(500.0)
        };

        for (MetodoPago pago : pagos) {
            if (pago instanceof Autenticable autenticable) {
                if (autenticable.autenticar()) {
                    pago.procesarPago();
                    pago.mostrarResumen();
                } else {
                    System.out.println(" Pago fallido.");
                }
            }
        }
    }
}
