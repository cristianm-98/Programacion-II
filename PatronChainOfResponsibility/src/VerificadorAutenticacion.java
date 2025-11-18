public class VerificadorAutenticacion implements Verificador {

    private Verificador siguiente;


    @Override
    public void establecerSiguiente(Verificador siguiente) {
        this.siguiente=siguiente;

    }

    @Override
    public void verificar(Transaccion transaccion) {
        if(transaccion.isUsuarioAutenticado()){
            System.out.println("Usuario autenticado correctamente");
            if(siguiente!=null) {
                siguiente.verificar(transaccion);
            }
        }else{
            System.out.println("Error usuario no autenticado");
        }
    }
}
