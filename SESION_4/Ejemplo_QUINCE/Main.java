import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Creamos dos empleados con el nombre null y la misma edad
        Empleado e1 = new Empleado(null, 25);
        Empleado e2 = new Empleado(null, 25);

        // Usamos Objects.equals para comparar los nombres de manera segura
        boolean nombresIguales = Objects.equals(e1.nombre(), e2.nombre());

        // Imprimimos los datos y el resultado de la comparación
        System.out.println("Empleado 1: " + e1);
        System.out.println("Empleado 2: " + e2);
        System.out.println("¿Los nombres son iguales?: " + nombresIguales);
    }
}
