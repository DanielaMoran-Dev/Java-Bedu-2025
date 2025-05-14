import java.util.Optional;

// Clase Contacto con uso de Optional
public class Contacto {
    private final Optional<String> telefono;

    // Constructor que usa Optional.ofNullable para permitir nulos
    public Contacto(String telefono) {
        this.telefono = Optional.ofNullable(telefono);
    }

    public Optional<String> getTelefono() {
        return telefono;
    }

    // Método main para probar los distintos usos de Optional
    public static void main(String[] args) {
        Contacto c1 = new Contacto("555-1234");
        Contacto c2 = new Contacto(null);

        // 1. Usando isPresent (menos recomendado)
        if (c1.getTelefono().isPresent()) {
            System.out.println("📞 Teléfono (c1 con isPresent): " + c1.getTelefono().get());
        }

        // 2. Usando ifPresent (más recomendado)
        c2.getTelefono().ifPresent(tel -> System.out.println("📞 Teléfono (c2 con ifPresent): " + tel));

        // 3. Usando orElse
        String tel1 = c1.getTelefono().orElse("No registrado");
        String tel2 = c2.getTelefono().orElse("No registrado");

        System.out.println("📞 Teléfono 1 (orElse): " + tel1);
        System.out.println("📞 Teléfono 2 (orElse): " + tel2);

        // 4. Usando orElseThrow
        try {
            String telSeguro = c1.getTelefono().orElseThrow(() -> new RuntimeException("⚠️ Teléfono obligatorio"));
            System.out.println("📞 Teléfono seguro (orElseThrow): " + telSeguro);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Esto lanzará excepción porque c2 no tiene teléfono
            String telFaltante = c2.getTelefono().orElseThrow(() -> new RuntimeException("⚠️ Teléfono obligatorio"));
            System.out.println("📞 Teléfono seguro (c2): " + telFaltante);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
