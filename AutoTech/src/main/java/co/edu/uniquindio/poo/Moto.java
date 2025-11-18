package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private String cilindaje;
    private String tipoMoto;

    public Moto (String id, String marca, String modelo, int anioFabricacion, double costoBase, String cilindaje, String tipoMoto){
        super(id,marca,modelo,anioFabricacion,costoBase);
        this.cilindaje=cilindaje;
        this.tipoMoto=tipoMoto;
    }

    public String getCilindaje() {
        return cilindaje;
    }

    public void setCilindaje(String cilindaje) {
        this.cilindaje = cilindaje;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    @Override
    public String mostrarInfo() {
        return super.toString();

    }
}
