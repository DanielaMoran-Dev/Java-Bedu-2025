public class SimuladorFarmacia {
    String medicamento;
    double precio;
    int piezas;
    public void Total() {
        double totalSinDescuento = precio * piezas;
        boolean aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;
        double totalConDescuento = totalSinDescuento - descuento;

        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + piezas);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);
    }
}
