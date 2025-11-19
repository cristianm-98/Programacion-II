package co.edu.uniquindio.poo.prueba.facade;

import co.edu.uniquindio.poo.prueba.factory.*;
import co.edu.uniquindio.poo.prueba.builder.Inmueble;

//Se implementa el patron Facade

public class InmuebleFacade {
    private FactoyInmueble factoyApartamento;
    private FactoyInmueble factoryCasa;
    private FactoyInmueble factoryFinca;
    private FactoyInmueble factoryLocal;

    public InmuebleFacade() {
        this.factoyApartamento = new FactoryApartamento();
        this.factoryCasa = new FactoryCasa();
        this.factoryFinca = new FactoryFinca();
        this.factoryLocal = new FactoryLocal();
    }
    public Inmueble crearApartamento(String id,String tipo,String ciudad, String numHabitacion, String numPiso, double precio) {
        return factoyApartamento.crearInmueble(id,tipo,ciudad,numHabitacion, numPiso, precio);
    }
    public Inmueble crearCasa(String id, String tipo,String ciudad, String numHabitacion, String numPiso, double precio) {
        return factoryCasa.crearInmueble(id,tipo,ciudad,numHabitacion, numPiso, precio);
    }
    public Inmueble crearFinca(String id,String tipo,String ciudad, String numHabitacion, String numPiso, double precio) {
        return factoryFinca.crearInmueble(id,tipo,ciudad,numHabitacion, numPiso, precio);
    }
    public Inmueble crearLocal(String id, String tipo,String ciudad, String numHabitacion, String numPiso, double precio) {
        return factoryLocal .crearInmueble(id,tipo,ciudad,numHabitacion, numPiso, precio);
    }

}
