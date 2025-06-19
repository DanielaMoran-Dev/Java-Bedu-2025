package panaderia;

import java.util.concurrent.Callable;

public class Panadero implements Callable<Void> {
    @Override
    public Void call() {
        try {
            int cantidad = (int)(Math.random() * 5) + 1;
            System.out.println("El panadero horneará " + cantidad + " panes");

            for (int i = 0; i < cantidad; i++) {
                int idx = (int)(Math.random() * Panaderia.catalogo.length);
                String pan = Panaderia.catalogo[idx];
                Thread.sleep(100);
                Panaderia.candado.lock();
                try {
                    Panaderia.canasta.add(pan);
                } finally {
                    Panaderia.candado.unlock();
                }
            }
        } catch (InterruptedException ex) {}
        return null;
    }
}
