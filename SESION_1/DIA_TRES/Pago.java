import java.util.Scanner;

public class Pago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimuladorFarmacia farmacia = new SimuladorFarmacia();
        System.out.print("Nombre del medicamento: ");
        farmacia.medicamento = scanner.nextLine();
        System.out.print("Precio: ");
        var precio = scanner.nextDouble(); 
        farmacia.precio = precio;
        System.out.print("Cantidad de piezas: ");
        farmacia.piezas = scanner.nextInt();
        farmacia.Total();
        scanner.close();
    }
}
