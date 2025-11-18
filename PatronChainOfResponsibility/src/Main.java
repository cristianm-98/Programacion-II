void main() {

    //Crea los manejadores

    Verificador autenticacion = new VerificadorAutenticacion();
    Verificador saldo = new VerificadorSaldo();
    Verificador fraude = new VerificadorFraude();


    //Formar la cadena: Autenticador + saldo + fraude
    autenticacion.establecerSiguiente(saldo);
    saldo.establecerSiguiente(fraude);

    //Crear transacciones de prueba

    //PRUEBA 1: TODO CORRECTO
    Transaccion transaccion1 = new Transaccion(true, 1000, 300, false);
    System.out.println("\n--- PRUBA 1: Transacción valida ---");
    autenticacion.verificar(transaccion1);

    //PRUEBA 2: USUARIO NO AUTENTICADO
    Transaccion transaccion2 = new Transaccion(false, 1000, 300, false);
    System.out.println("\n-- PRUEBA 2: Usuario no autenticado ---");
    autenticacion.verificar(transaccion2);

    //PRUEBA 3: SALDO INSUFICIENTE
    Transaccion transaccion3 = new Transaccion(true, 200, 500, false);
    System.out.println("\n-- PRUBA 3: Saldo Insuficiente --");
    autenticacion.verificar(transaccion3);

    //** PRUEBA 4: TRANSACCION SOSPECHOSA
    Transaccion transaccion4 = new Transaccion(true, 1000, 300, true);
    System.out.println("\n-- PRUBA 4: Transacción sospechosa --");
    autenticacion.verificar(transaccion4);


}
