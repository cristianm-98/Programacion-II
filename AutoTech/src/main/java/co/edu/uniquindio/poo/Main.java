package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = Empresa.getInstance();
        Scanner teclado = new Scanner(System.in);

        int op;
        do {
            System.out.println("---- MENU ---- ");
            System.out.println("1. Registrar Vehiculo");
            System.out.println("2. Mostrar vehiculos");
            System.out.println("3. Salir");

            System.out.println("Ingrese la opcion");
            op = teclado.nextInt();

            switch (op){
                case 1:
                    empresa.agregarVehiculoMenu(teclado);
                    break;

                case 2:
                    empresa.mostrarVehiculos();
                    break;
            }
        }
        while (op!=3);
    }
}