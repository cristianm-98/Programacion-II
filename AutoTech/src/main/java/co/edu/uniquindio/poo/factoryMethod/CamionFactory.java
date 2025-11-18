package co.edu.uniquindio.poo.factoryMethod;

import co.edu.uniquindio.poo.Camion;
import co.edu.uniquindio.poo.Moto;
import co.edu.uniquindio.poo.Vehiculo;

public class CamionFactory implements VehiculoFactory{
    @Override
    public Vehiculo crearVehiculo(String id, String marca, String modelo, int anioFabricacion, double costoBase, Object extra1, Object extra2) {
        double capacidadCarga=(double)extra1;
        int numEjes=(int) extra2;
        return new Camion(id,marca,modelo,anioFabricacion,costoBase,capacidadCarga,numEjes);
    }
}
