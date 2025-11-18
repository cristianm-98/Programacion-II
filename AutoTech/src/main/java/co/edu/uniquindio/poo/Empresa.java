package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.factoryMethod.AutoFactory;
import co.edu.uniquindio.poo.factoryMethod.CamionFactory;
import co.edu.uniquindio.poo.factoryMethod.MotoFactory;
import co.edu.uniquindio.poo.factoryMethod.VehiculoFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    private static Empresa instance;
    private String nit;
    private String nombre;
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    private Empresa() {
        this.nit = "8100";
        this.nombre = "Auto Tech";
        listaVehiculos.add(new Auto("A01", "Toyota", "Corolla", 2020, 40000, 4, false));
        listaVehiculos.add(new Moto("M01", "Suzuki", "GSX250R", 2020, 15000, "250", "Sport"));
        listaVehiculos.add(new Camion("C01", "Mercedes", "Actros 2545", 2021, 45000, 25.5, 4));

    }

    public static Empresa getInstance() {
        if (instance == null) {
            instance = new Empresa();
        }
        return instance;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }


    public void agregarVehiculoMenu(Scanner teclado) {
        System.out.println(" ---REGISTRO VEHICULO --- ");
        System.out.println("1. Agregar Auto");
        System.out.println("2. Agregar Moto");
        System.out.println("3.Agregar Camion");
        System.out.println("Ingrese la Opcion");
        int op = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Id: ");
        String id = teclado.nextLine();
        System.out.println("Marca: ");
        String marca = teclado.nextLine();
        System.out.println("Modelo: ");
        String modelo = teclado.nextLine();
        System.out.println("Año de fabricación: ");
        int anioFabricacion = teclado.nextInt();
        System.out.println("Costo: ");
        double costoBase = teclado.nextDouble();
        teclado.nextLine();

        VehiculoFactory factory = null;
        Vehiculo vehiculo = null;

        switch (op) {
            case 1:
                System.out.println("Numero de puertas: ");
                int puerta = teclado.nextInt();
                System.out.println("Es electrico: False/True");
                boolean esElectrico = teclado.nextBoolean();
                factory = new AutoFactory();
                vehiculo = factory.crearVehiculo(id, marca, modelo, anioFabricacion, costoBase, puerta, esElectrico);
                break;

            case 2:
                System.out.println("Cilindraje: ");
                String cilindraje = teclado.nextLine();
                System.out.println("Tipo de moto: ");
                String tipo = teclado.nextLine();
                factory = new MotoFactory();
                vehiculo = factory.crearVehiculo(id, marca, modelo, anioFabricacion, costoBase, cilindraje, tipo);
                break;

            case 3:
                System.out.println("Capacidad carga: ");
                double capacidad = teclado.nextDouble();
                System.out.println("Numero de ejes");
                int numEjes = teclado.nextInt();
                factory = new CamionFactory();
                vehiculo = factory.crearVehiculo(id, marca, modelo, anioFabricacion, costoBase, capacidad, numEjes);
                break;
        }
        if(vehiculo!=null) {
            listaVehiculos.add(vehiculo);
        }
    }

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo != null) {
                System.out.println(vehiculo.mostrarInfo());
            }
        }
    }
}