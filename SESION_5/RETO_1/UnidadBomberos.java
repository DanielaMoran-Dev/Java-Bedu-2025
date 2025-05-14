public class UnidadBomberos extends UnidadEmergencia {
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public UnidadBomberos(String nombre, Operador operador) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = operador;
    }

    @Override
    public void responder() {
        System.out.println("🔥 Unidad de bomberos respondiendo a incendio estructural.");
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    public SistemaGPS getGps() {
        return gps;
    }

    public void setGps(SistemaGPS gps) {
        this.gps = gps;
    }

    public Sirena getSirena() {
        return sirena;
    }

    public void setSirena(Sirena sirena) {
        this.sirena = sirena;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }
}
