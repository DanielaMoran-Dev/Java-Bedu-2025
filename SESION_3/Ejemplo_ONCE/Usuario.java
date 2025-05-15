// Archivo: Usuario.java

public class Usuario {
    // Atributos privados (no se pueden acceder directamente desde fuera)
    private final String nombre;
    private double saldo;

    // Constructor
    public Usuario(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    // Métodos públicos para acceder a los atributos privados (encapsulación)
    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("⚠️ Saldo insuficiente.");
        }
    }
}
