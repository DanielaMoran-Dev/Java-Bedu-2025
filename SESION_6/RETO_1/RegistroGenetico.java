import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RegistroGenetico {
    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden de llegada (pueden repetirse)
        ArrayList<String> especies = new ArrayList<>();
        especies.add("Homo sapiens");
        especies.add("Mus musculus");
        especies.add("Arabidopsis thaliana");
        especies.add("Homo sapiens"); // repetida
        especies.add("Drosophila melanogaster");

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(especies);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> muestrasInvestigadores = new HashMap<>();
        muestrasInvestigadores.put("M-001", "Dra. López");
        muestrasInvestigadores.put("M-002", "Dr. Hernández");
        muestrasInvestigadores.put("M-003", "Dra. García");
        muestrasInvestigadores.put("M-004", "Dr. Martínez");

        // Paso 4: Mostrar resultados

        // Mostrar todas las especies en orden de llegada
        System.out.println("📥 Lista completa de muestras en orden:");
        for (String especie : especies) {
            System.out.println("- " + especie);
        }

        // Mostrar especies únicas procesadas
        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // Mostrar relación ID de muestra → investigador
        System.out.println("\n🧑‍🔬 Relación de muestras (ID → Investigador):");
        for (String id : muestrasInvestigadores.keySet()) {
            System.out.println(id + " → " + muestrasInvestigadores.get(id));
        }

        try ( // Búsqueda por ID
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("\n🔍 Ingresa el ID de muestra que deseas buscar (ej. M-002): ");
            String idBusqueda = scanner.nextLine();
            
            if (muestrasInvestigadores.containsKey(idBusqueda)) {
                System.out.println("🔎 Resultado: " + idBusqueda + " → " + muestrasInvestigadores.get(idBusqueda));
            } else {
                System.out.println("❌ ID no encontrado en el registro.");
            }
        }
    }
}
