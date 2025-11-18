public interface Verificador {

    void establecerSiguiente(Verificador siguiente);
    void verificar(Transaccion transaccion);

}
