package co.edu.uniquindio.poo.prueba.factory;

import co.edu.uniquindio.poo.prueba.builder.Inmueble;
import co.edu.uniquindio.poo.prueba.builder.Local;

//Se implementa el patron FactoryMethod
public class FactoryLocal implements FactoyInmueble{
    @Override
    public Inmueble crearInmueble(String id, String tipo,String ciudad, String numHabitacion, String numPiso, double precio) {
        return new Local.Builder()
                .id(id)
                .tipo(tipo)
                .ciudad(ciudad)
                .numHabitacion(numHabitacion)
                .numPiso(numPiso)
                .precio(precio)
                .build();
    }
}
