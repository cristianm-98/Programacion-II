package co.edu.uniquindio.poo;

public abstract class  Vehiculo {
    private String id;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double costoBase;

    public Vehiculo(String id, String marca, String modelo, int anioFabricacion, double costoBase){
        this.id=id;
        this.marca=marca;
        this.modelo=modelo;
        this.anioFabricacion=anioFabricacion;
        this.costoBase=costoBase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public double getCosto(){
        return costoBase;
    }

    @Override
    public String toString() {
        return " Id: " + id + "\n" +
                " Marca: " + marca + "\n" +
                " Modelo: " + modelo + "\n" +
                " Año de fabricación: " + anioFabricacion + "\n" +
                " Costo: " + costoBase;
    }
    public abstract String mostrarInfo();

}
