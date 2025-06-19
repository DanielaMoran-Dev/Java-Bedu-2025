package primos;

import java.util.LinkedList;
import java.util.List;

public class CalculadoraPrimos {

    public static boolean esPrimo(long numero) {
        if (numero <= 1) return false;
        if (numero <= 3) return true;
        if (numero % 2 == 0 || numero % 3 == 0) return false;

        for (long i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) return false;
        }

        return true;
    }

    public static List<Long> calcularPrimerosPrimos(int cantidad) {
        List<Long> primos = new LinkedList<>();
        long numero = 2;

        while (primos.size() < cantidad) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
            numero++;
        }

        return primos;
    }
}
