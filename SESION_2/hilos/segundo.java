package hilos;

public class segundo implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("🧶 Hilo 2: " + i);
        }
    }
}
