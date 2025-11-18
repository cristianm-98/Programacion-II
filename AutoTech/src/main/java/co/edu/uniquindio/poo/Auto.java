package co.edu.uniquindio.poo;

public class Auto extends Vehiculo {
    private int numPuerta;
    private boolean esElectrico;

    public Auto (String id, String marca, String modelo, int anioFabricacion, double costoBase, int numeroPuertas, boolean esElectrico){
        super(id,marca,modelo,anioFabricacion,costoBase);
        this.numPuerta =numeroPuertas;
        this.esElectrico=esElectrico;
    }

    public int getNumPuerta() {
        return numPuerta;
    }

    public void setNumPuerta(int numPuerta) {
        this.numPuerta = numPuerta;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    @Override
    public String mostrarInfo() {
        return super.toString() + "\n" +
                "Numero de puertas: " + numPuerta + "\n" +
                "Electrico: " + esElectrico;
    }
}
