public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Obra de Teatro", 450);
        Entrada entrada2 = new Entrada("Concierto", 900);
        Entrada_Record entrada3 = new Entrada_Record("Stand Up", 350);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();
    }
}
