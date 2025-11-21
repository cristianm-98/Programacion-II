public class AdapterEurpeoAUSB implements CargadorUSBC{
    private EnfucheEuropeo enchufe;

    public AdapterEurpeoAUSB(EnfucheEuropeo enchufe){
        this.enchufe=enchufe;
    }

    @Override
    public void cargadorUSBC() {
        System.out.println("Adaptando energia europea a USB-C");
        enchufe.suministrarEnergiaEuropea();
        System.out.println("Celular cargando por USB-C");
    }
}
