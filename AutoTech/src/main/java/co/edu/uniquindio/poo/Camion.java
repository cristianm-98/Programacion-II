package co.edu.uniquindio.poo;

public class Camion extends Vehiculo{
    private double capacidadCarga;
    private int numEjes;

    public Camion (String id, String marca, String modelo, int anioFabricacion, double costoBase, double capacidadCarga,int numEjes){
        super(id,marca,modelo,anioFabricacion,costoBase);
        this.capacidadCarga=capacidadCarga;
        this.numEjes=numEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public String mostrarInfo() {
        return super.toString();

    }
}
