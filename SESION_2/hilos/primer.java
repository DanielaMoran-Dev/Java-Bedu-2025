package hilos;

public class primer extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hilo 1: " + i);
        }
    }
}
