package candado;

import java.util.concurrent.Callable;

public class Incrementador implements Callable<Void> {
    @Override
    public Void call() {
        for (int i = 0; i < 10000; i++) {
            MemoriaCompartida.candado.lock();
            try {
                MemoriaCompartida.valor++;
            } finally {
                MemoriaCompartida.candado.unlock();
            }
        }
        return null;
    }
}
