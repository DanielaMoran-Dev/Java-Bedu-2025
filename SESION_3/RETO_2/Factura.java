import java.util.Optional;

public class Factura {
    private final double monto;
    private final String descripcion;
    private final Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        // Si el RFC es null, se usa Optional.empty()
        this.rfc = (rfc == null) ? Optional.empty() : Optional.of(rfc);
    }

    public String getResumen() {
        String resumen = """
                         \ud83d\udcc4 Factura generada:
                         Descripci\u00f3n: """ + descripcion + "\n" +
                         "Monto: $" + monto + "\n" +
                         "RFC: " + (rfc.isPresent() ? rfc.get() : "[No proporcionado]");
        return resumen;
    }
}
