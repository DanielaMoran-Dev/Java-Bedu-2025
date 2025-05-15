import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

// Clase Tema que implementa Comparable para ordenar por título
class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad; 

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    // Orden natural: por título alfabético
    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }

    @Override
    public String toString() {
        return "📘 Tema: " + titulo + " (Prioridad: " + prioridad + ")";
    }
}

public class PlaneacionTemas {
    public static void main(String[] args) {

        // Lista segura para gestionar temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        // Agregamos temas
        temas.add(new Tema("Lectura", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 2));
        temas.add(new Tema("Educación emocional", 3));
        temas.add(new Tema("Uso seguro de internet", 1));

        // Repositorio concurrente de recursos por tema
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");
        recursos.put("Educación emocional", "https://recursos.edu/emociones");
        recursos.put("Uso seguro de internet", "https://recursos.edu/seguridad");

        Collections.sort(temas);
        System.out.println("Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("\nTemas ordenados por prioridad:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        System.out.println("\nRepositorio de recursos por tema:");
        for (String clave : recursos.keySet()) {
            System.out.println("🔹 " + clave + " → " + recursos.get(clave));
        }
    }
}
