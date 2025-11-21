void main() {
    EnfucheEuropeo enfucheEuropeo= new EnfucheEuropeo();

    CargadorUSBC adaptador= new AdapterEurpeoAUSB(enfucheEuropeo);

    Celular celular = new Celular(adaptador);

    celular.cargar();

}
