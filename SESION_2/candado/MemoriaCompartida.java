package candado;

import java.util.concurrent.locks.ReentrantLock;

public class MemoriaCompartida {
    public static int valor = 0;
    public static ReentrantLock candado = new ReentrantLock();
}
