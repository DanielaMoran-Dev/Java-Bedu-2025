package hilos;

public class Main {
    public static void main(String[] args) {
        primer hilo1 = new primer();
        Thread hilo2 = new Thread(new segundo());
        hilo1.start();
        hilo2.start();
    }
}
