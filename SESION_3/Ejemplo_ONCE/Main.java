// Archivo: Main.java

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo usuario
        Usuario u = new Usuario("Mario", 500.0);

        // Mostrar nombre
        System.out.println("👤 Usuario: " + u.getNombre());

        // Mostrar saldo inicial
        System.out.println("💰 Saldo inicial: $" + u.getSaldo());

        // Realizar depósito
        u.depositar(250.0);
        System.out.println("💰 Después del depósito: $" + u.getSaldo());

        // Realizar retiro
        u.retirar(100.0);
        System.out.println("💰 Después del retiro: $" + u.getSaldo());
    }
}
