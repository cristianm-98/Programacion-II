package co.edu.uniquindio.poo.prueba.factory;

import co.edu.uniquindio.poo.prueba.builder.Apartamento;
import co.edu.uniquindio.poo.prueba.builder.Inmueble;

//Se implementa el patron FactoryMethod
public class FactoryApartamento implements FactoyInmueble{
    @Override
    public Inmueble crearInmueble(String id,String tipo,String ciudad, String numHabitacion, String numPiso, double precio) {
        return new Apartamento.Builder()
                .id(id)
                .tipo(tipo)
                .ciudad(ciudad)
                .numHabitacion(numHabitacion)
                .numPiso(numPiso)
                .precio(precio)
                .build();
    }
}
