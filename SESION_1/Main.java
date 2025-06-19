import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CuentaDebito> listaDebito = new ArrayList<>();
        listaDebito.add(new CuentaDebito("José"));
        listaDebito.add(new CuentaDebito("Pepe"));

        List<CuentaCredito> listaCredito = new ArrayList<>();
        listaCredito.add(new CuentaCredito("Sofy"));

        System.out.println("* Ver cuentas de débito *");
        Banco.verCuentas(listaDebito);

        System.out.println("* Ver titulares de crédito *");
        Banco.verTitulares(listaCredito);

        System.out.println("* Depositar a cuentas de débito *");
        Banco.depositarACuentas(new ArrayList<>(listaDebito));

        Banco.verCuentas(listaDebito);
    }
}
