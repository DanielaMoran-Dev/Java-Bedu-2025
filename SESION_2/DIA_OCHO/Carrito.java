public class Carrito {
    public static void main(String[] args) {
        String[] productos = {"Laptop", "Mouse", "Teclado", "Pantalla", "Audífonos"};

        System.out.println("Productos en el carrito:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }

        System.out.println("\nRecorriendo con for-each:");
        for (String producto : productos) {
            if (producto.equals("Teclado")) continue; 
            if (producto.equals("Pantalla")) break;   
            System.out.println("Producto válido: " + producto);
        }
    }
}
