// Definimos un record simple con dos campos: nombre y edad
public record Empleado(String nombre, Integer edad) {
    // No es necesario agregar métodos: Java ya genera constructor, toString, equals, etc.
}
