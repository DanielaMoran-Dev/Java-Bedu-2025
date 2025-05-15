import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué decides hacer? (1 = Ayudar, 2 = Ignorar): ");
        String eleccion = sc.nextLine();
        return eleccion.equals("1") ? "ayudar" : "ignorar";
    }
}
