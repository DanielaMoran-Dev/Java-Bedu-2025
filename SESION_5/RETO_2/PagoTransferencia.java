public class PagoTransferencia extends MetodoPago implements Autenticable {
    public PagoTransferencia(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        // Simulación de validación de transferencia bancaria
        System.out.println("Fallo de autenticación. Transferencia no válida.");
        return false; // Simulación de fallo de autenticación
    }

    @Override
    public void procesarPago() {
        // No se procesará si la autenticación falla
    }
}
