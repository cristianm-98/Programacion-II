package co.edu.uniquindio.poo.prueba.builder;

public class Inmueble {

    private String id;
    private String tipo;
    private String ciudad;
    private String numHabitacion;
    private String numPiso;
    private double precio;

    public Inmueble(String id,String tipo, String ciudad, String numHabitacion, String numPiso, double precio) {
        this.id=id;
        this.tipo = tipo;
        this.ciudad = ciudad;
        this.numHabitacion = numHabitacion;
        this.numPiso = numPiso;
        this.precio = precio;
    }
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id=id;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(String numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(String numPiso) {
        this.numPiso = numPiso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
