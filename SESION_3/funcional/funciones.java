package funcional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class funciones {
    
    public static void main(String[] args) {

        // Lista original de números del 1 al 10
        List<Integer> numeritos = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Lista original:");
        numeritos.forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        for (int i = 0; i < numeritos.size(); i++) {
            int miNumero = numeritos.get(i);
            int nuevoNumero = miNumero * 2 + 1; 
            numeritos.set(i, nuevoNumero);
        }

        System.out.println("🔁 Después de aplicar *2 + 1 (OOP):");
        numeritos.forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        Function<Integer, Integer> elevarAlCuadrado = x -> x * x;

        List<Integer> cuadrados = numeritos
            .stream()
            .map(elevarAlCuadrado)
            .collect(Collectors.toList());

        System.out.println("Lista nueva con cuadrados (Funcional):");
        cuadrados.forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        Function<Integer, Integer> soloParesPor100 = x -> (x % 2 == 0) ? x * 100 : x;

        List<Integer> listaEspecial = numeritos
            .stream()
            .map(soloParesPor100)
            .collect(Collectors.toList());

        System.out.println("Pares multiplicados por 100:");
        listaEspecial.forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("Impresión directa:");
        numeritos
            .stream()
            .forEach(System.out::println);
    }
}
