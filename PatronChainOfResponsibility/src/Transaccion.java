public class Transaccion {

    private boolean usuarioAutenticado;
    private double saldoDisponible;
    private double monto;
    private boolean sospechoso;

    public Transaccion(boolean usuarioAutenticado, double saldoDisponible, double monto, boolean sospechoso) {
        this.usuarioAutenticado = usuarioAutenticado;
        this.saldoDisponible = saldoDisponible;
        this.monto = monto;
        this.sospechoso = sospechoso;
    }

    public boolean isUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    public void setUsuarioAutenticado(boolean usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isSospechoso() {
        return sospechoso;
    }

    public void setSospechoso(boolean sospechoso) {
        this.sospechoso = sospechoso;
    }
}
