public class Alquiler {
    private int hora;
    private Bicicleta bicicleta;

    public Alquiler(int hora,Bicicleta bicicleta){
        this.hora=hora;
        this.bicicleta=bicicleta;
    }
    public int getHora(){
        return hora;
    }
    public void setHora(int hora){
        this.hora=hora;
    }
    public double calcularTotal(){
        return bicicleta.tarifaHora()*hora;
    }
}
