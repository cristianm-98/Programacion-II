package co.edu.uniquindio.poo.factoryMethod;

import co.edu.uniquindio.poo.Vehiculo;

public interface VehiculoFactory {

    Vehiculo crearVehiculo(String id, String marca, String modelo, int anioFabricacion, double costoBase, Object extra1, Object extra2);
}
