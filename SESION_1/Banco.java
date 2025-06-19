import java.util.List;

public class Banco {

    public static void verCuentas(List<?> cuentas) {
        for (Object o : cuentas) {
            System.out.println(o);
        }
    }

    public static void verTitulares(List<? extends CuentaBancaria> cuentas) {
        for (CuentaBancaria o : cuentas) {
            System.out.println(o.getTitular());
        }
    }

    public static void depositarACuentas(List<? super CuentaDebito> cuentas) {
        for (Object o : cuentas) {
            if (o instanceof CuentaBancaria cuenta) {
                cuenta.depositar(500);
            }
        }
    }
}
