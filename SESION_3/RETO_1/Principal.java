public class Principal {
    public static void main(String[] args) {
        // Crear pasajero y vuelo
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "P123456");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Reservar asiento
        if (vuelo.reservarAsiento(pasajero1)) {
            System.out.println("✅ Reserva realizada con éxito.");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("❌ Cancelando reserva...");
        vuelo.cancelarReserva();

        // Mostrar itinerario nuevamente
        System.out.println(vuelo.obtenerItinerario());

        // Nueva reserva usando nombre y pasaporte directamente
        vuelo.reservarAsiento("Mario Gonzalez", "M7891011");

        // Mostrar itinerario final
        System.out.println(vuelo.obtenerItinerario());
    }
}
