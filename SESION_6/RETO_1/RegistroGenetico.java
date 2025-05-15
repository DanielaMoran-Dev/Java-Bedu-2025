import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RegistroGenetico {
    public static void main(String[] args) {

        ArrayList<String> especies = new ArrayList<>();
        especies.add("Homo sapiens");
        especies.add("Mus musculus");
        especies.add("Arabidopsis thaliana");
        especies.add("Homo sapiens"); // repetida
        especies.add("Drosophila melanogaster");

        HashSet<String> especiesUnicas = new HashSet<>(especies);


        HashMap<String, String> muestrasInvestigadores = new HashMap<>();
        muestrasInvestigadores.put("M-001", "Dra. Moran");
        muestrasInvestigadores.put("M-002", "Dr. Perez");
        muestrasInvestigadores.put("M-003", "Dra. Gonzalez");
        muestrasInvestigadores.put("M-004", "Dr. Davila");

        System.out.println("Lista completa de muestras en orden:");
        for (String especie : especies) {
            System.out.println("- " + especie);
        }

        System.out.println("\nspecies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("\nRelación de muestras (ID → Investigador):");
        for (String id : muestrasInvestigadores.keySet()) {
            System.out.println(id + " → " + muestrasInvestigadores.get(id));
        }

        try ( 
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nIngresa el ID de muestra que deseas buscar (ej. M-002): ");
            String idBusqueda = scanner.nextLine();
            
            if (muestrasInvestigadores.containsKey(idBusqueda)) {
                System.out.println("Resultado: " + idBusqueda + " → " + muestrasInvestigadores.get(idBusqueda));
            } else {
                System.out.println("ID no encontrado en el registro.");
            }
        }
    }
}
