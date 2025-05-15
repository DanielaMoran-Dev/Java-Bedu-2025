public class Principal {
    public static void main(String[] args) {
        Factura f1 = new Factura("FAC001", "Daniela Moran", 1450.0);
        Factura f2 = new Factura("FAC001", "Comercial Mexicana", 1450.0);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}
