public class Principal {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public Principal(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void ejecutarEscena() {
        dialogo.mostrarDialogo("Un anciano te pide ayuda para cruzar el río.");

        String respuesta = decision.tomarDecision();

        if (respuesta.equals("ayudar")) {
            dialogo.mostrarDialogo("Lo ayudas y te da una reliquia mágica.");
        } else {
            dialogo.mostrarDialogo("Lo ignoras y sigues tu camino. El cielo se nubla...");
        }

        transicion.siguienteEscena();
    }

    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        Principal narrativa = new Principal(transicion, dialogo, decision);
        narrativa.ejecutarEscena();
    }
}
