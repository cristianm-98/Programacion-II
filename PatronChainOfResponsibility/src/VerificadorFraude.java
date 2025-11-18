public class VerificadorFraude implements Verificador{

    private Verificador siguiente;

    @Override
    public void establecerSiguiente(Verificador siguiente) {
        this.siguiente=siguiente;
    }

    @Override
    public void verificar(Transaccion transaccion) {
        if(!transaccion.isSospechoso()){
            System.out.println("Sin actividad fraudulenta");
            if(siguiente!=null){
                siguiente.verificar(transaccion);
            }
        }else{
            System.out.println("Transaccion sospechosa. Bloqueada");
        }

    }
}
