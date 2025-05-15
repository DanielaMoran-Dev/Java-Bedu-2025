public class Estudiante {
    // Características del estudiante
    String nombre;
    int edad;

    // Método que muestra un saludo con los datos del estudiante
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    // Método principal para ejecutar el program
    public static void main(String[] args) {
        // Crear un objeto Estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Daniela";
        estudiante.edad = 20;

        // Llamar al método saludar
        estudiante.saludar();
    }
}
