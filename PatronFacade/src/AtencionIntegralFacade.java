public class AtencionIntegralFacade {
    private Admisiones admisiones;
    private AgendaMedica agendaMedica;
    private Caja caja;
    private Consultorio consultorio;
    private Farmacia farmacia;
    private Laboratorio laboratorio;

    public AtencionIntegralFacade(){
        this.admisiones=new Admisiones();
        this.agendaMedica=new AgendaMedica();
        this.caja=new Caja();
        this.consultorio=new Consultorio();
        this.farmacia=new Farmacia();
        this.laboratorio=new Laboratorio();
    }

    public void atenderConsulta(String nombrePaciente){
        System.out.println("--Iniciando atencion integral--");

        admisiones.registrarPaciente(nombrePaciente);
        caja.validarPago();
        agendaMedica.asignarMedico();
        consultorio.atenderPaciente();
        laboratorio.procesarOrdenes();
        farmacia.entregarMedicamentos();

        System.out.println("--Atencion finalizada");

    }
}
