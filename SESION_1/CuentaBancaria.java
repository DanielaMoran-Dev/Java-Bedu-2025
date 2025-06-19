public class CuentaBancaria {

    private final String titular;
    private double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 10; 
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 10) {
            saldo += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Titular: " + titular + ", Saldo: $" + saldo;
    }
}
