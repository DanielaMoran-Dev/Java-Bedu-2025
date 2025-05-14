public class Variable {
    public static void main(String[] args) {
        int edad = 28;
        double salario = 15499.50;
        boolean activo = true;
        char inicial = 'A';
        var ciudad = "Aguascalietes";

        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
        System.out.println("Activo: " + activo);
        System.out.println("Inicial: " + inicial);
        System.out.println("Ciudad: " + ciudad);

        double precio = 200.56;
        int precioRedondeado = (int) precio;
        System.out.println("Precio original: " + precio);
        System.out.println("Precio redondeado: " + precioRedondeado);
    }
}