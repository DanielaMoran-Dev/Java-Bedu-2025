package org.bedu.reactivo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import io.reactivex.rxjava3.core.Observable;

public class Mostrador {

    public static Observable<Pizza> tomarPedidos() {
        Scanner sc = new Scanner(System.in);

        return Observable.create(emitter -> {
            while (true) {
                System.out.println("\n¿Quieres ordenar una pizza?");
                System.out.println("1. Sí");
                System.out.println("2. No");

                int opcion = sc.nextInt();
                sc.nextLine();

                if (opcion == 2) break;
                if (opcion != 1) {
                    System.out.println("Opción inválida");
                    continue;
                }

                List<String> seleccionados = new LinkedList<>();

                while (true) {
                    System.out.println("\nElige un ingrediente (0 para terminar):");
                    for (int i = 1; i <= Pizzeria.ingredientes.size(); i++) {
                        System.out.println(i + ". " + Pizzeria.ingredientes.get(i - 1));
                    }

                    int opcionIng = sc.nextInt();
                    sc.nextLine();

                    if (opcionIng == 0) break;
                    if (opcionIng < 0 || opcionIng > Pizzeria.ingredientes.size()) {
                        System.out.println("Ingrediente inválido");
                        continue;
                    }

                    seleccionados.add(Pizzeria.ingredientes.get(opcionIng - 1));
                }

                Pizza nuevaPizza = new Pizza(seleccionados);
                emitter.onNext(nuevaPizza);
            }

            emitter.onComplete();
        });
    }
}
