public class Facturacion {
    public static void main(String[] args) {
        double precioCafe = 65.50;
        double precioPastel = 90.00;
        double precioAgua = 30.00;

        int cantidadCafe = 3;
        int cantidadPastel = 2;
        int cantidadAgua = 3;

        // El cliente decidió agregar otro pastel 
        cantidadPastel++; 

        double total = (precioCafe * cantidadCafe) + (precioPastel * cantidadPastel) + (precioAgua * cantidadAgua);

        boolean aplicaDescuento = total > 150;

        double descuento = aplicaDescuento ? total * 0.10 : 0;

        double totalFinal = total - descuento;

        System.out.println("Total de la compra: $" + total);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}