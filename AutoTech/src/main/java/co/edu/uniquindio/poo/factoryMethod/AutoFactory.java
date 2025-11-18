package co.edu.uniquindio.poo.factoryMethod;

import co.edu.uniquindio.poo.Auto;
import co.edu.uniquindio.poo.Vehiculo;


public class AutoFactory implements VehiculoFactory{

    @Override
    public Vehiculo crearVehiculo(String id, String marca, String modelo, int anioFabricacion, double costoBase, Object extra1, Object extra2) {
        int numPuerta=(int)extra1;
        boolean esElectrico=(boolean) extra2;
        return new Auto(id,marca,modelo,anioFabricacion,costoBase,numPuerta,esElectrico);
    }
}
