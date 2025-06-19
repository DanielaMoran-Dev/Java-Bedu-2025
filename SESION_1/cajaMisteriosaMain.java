public class cajaMisteriosaMain {

    public static void main(String ... args) {

        CajaMisteriosa<String> cajita = new CajaMisteriosa<>();
        cajita.guardar("Hola soy Dany Moran");
        String valor = cajita.sacar();

        System.out.println("El valor de la caja es : " + valor);

        CajaMisteriosa<Integer> cajitaNumeros = new CajaMisteriosa<>();
        cajitaNumeros.guardar(1);

        CajaMisteriosa<Boolean> cajitaBool = new CajaMisteriosa<>();
        cajitaBool.guardar(true);

        System.out.println("Número guardado: " + cajitaNumeros.sacar());
        System.out.println("Boolean guardado: " + cajitaBool.sacar());
    }
}
