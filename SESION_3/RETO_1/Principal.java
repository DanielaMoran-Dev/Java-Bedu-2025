public class Principal {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Daniela Moran", "N8979");
        Vuelo vuelo = new Vuelo("UX123", "Uruguay", "05:30");

        if (vuelo.reservarAsiento(pasajero1)) {
            System.out.println("Reserva realizada con éxito.");
        }

        System.out.println(vuelo.obtenerItinerario());

        System.out.println("Cancelando reserva...");
        vuelo.cancelarReserva();

        System.out.println(vuelo.obtenerItinerario());

        // Nueva reserva usando nombre y pasaporte directamente
        vuelo.reservarAsiento("Diego Gonzalez", "P987Y");

        System.out.println(vuelo.obtenerItinerario());
    }
}
