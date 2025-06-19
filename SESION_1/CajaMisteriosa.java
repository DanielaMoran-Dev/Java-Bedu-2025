public class CajaMisteriosa<X> {

    private X valor;

    public void guardar(X nuevoValor) {
        this.valor = nuevoValor;
    }

    public X sacar() {
        return valor;
    }

    public boolean estaVacia() {
        return valor == null;
    }
}
