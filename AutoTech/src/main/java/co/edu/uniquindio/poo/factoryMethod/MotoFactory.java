package co.edu.uniquindio.poo.factoryMethod;

import co.edu.uniquindio.poo.Moto;
import co.edu.uniquindio.poo.Vehiculo;

public class MotoFactory implements VehiculoFactory{
    @Override
    public Vehiculo crearVehiculo(String id, String marca, String modelo, int anioFabricacion, double costoBase, Object extra1, Object extra2) {
        String cilindraje=(String)extra1;
        String tipoMoto=(String)extra2;
        return new Moto(id,marca,modelo,anioFabricacion,costoBase,cilindraje,tipoMoto);
    }
}
