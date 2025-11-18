package org.example;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("1010", "Nory Navas", "5845454");
        Cuenta cuenta1 = new Cuenta("C101", cliente1);
        Prestamo prestamo1 = new Prestamo("P001", cuenta1, 10000);

        prestamo1.abonar(8000);
        prestamo1.abonar(3000);

        System.out.println(prestamo1.toString());


    }
}