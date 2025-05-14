public class Vuelo {
    private final String codigoVuelo;
    private final String destino;
    private final String horaSalida;
    private Pasajero asientoReservado;

    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        }
        return false;
    }

    public boolean reservarAsiento(String nombre, String pasaporte) {
        if (asientoReservado == null) {
            asientoReservado = new Pasajero(nombre, pasaporte);
            return true;
        }
        return false;
    }

    public void cancelarReserva() {
        asientoReservado = null;
    }

    public String obtenerItinerario() {
        String pasajeroInfo = (asientoReservado != null) ? asientoReservado.getNombre() : "[Sin reserva]";
        return """
               
               Itinerario del vuelo:
               C\u00f3digo: """ + codigoVuelo + "\n" +
               "Destino: " + destino + "\n" +
               "Salida: " + horaSalida + "\n" +
               "Pasajero: " + pasajeroInfo + "\n";
    }
}
