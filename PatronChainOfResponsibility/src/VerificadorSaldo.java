public class VerificadorSaldo implements Verificador {

    private Verificador siguiente;

    @Override
    public void establecerSiguiente(Verificador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void verificar(Transaccion transaccion) {
        if (transaccion.getSaldoDisponible() >= transaccion.getMonto()) {
            System.out.println("Saldo suficiente");
            if (siguiente != null) {
                siguiente.verificar(transaccion);
            }
        } else {
            System.out.println("Error saldo insuficiente");
        }

    }
}
