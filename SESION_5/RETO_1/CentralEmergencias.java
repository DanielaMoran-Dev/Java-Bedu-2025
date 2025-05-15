public class CentralEmergencias {
    public static void main(String[] args) {
        Operador operador1 = new Operador("Dany");
        Operador operador2 = new Operador("Laura");
        Operador operador3 = new Operador("Oscar");

        // Crear unidades
        Ambulancia ambulancia = new Ambulancia("Ambulancia", operador1);
        Patrulla patrulla = new Patrulla("Patrulla", operador2);
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", operador3);

        // Iniciar operaciones
        ambulancia.iniciarOperacion();
        patrulla.iniciarOperacion();
        bomberos.iniciarOperacion();
    }
}
