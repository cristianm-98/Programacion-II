
void main() {

    ConfiguracionSistema config1 = ConfiguracionSistema.getInstance();
    ConfiguracionSistema config2 = ConfiguracionSistema.getInstance();

    System.out.println("¿Es la misma instancia? : " + (config1 == config2));
    System.out.println("El nombre del sistema: " + config1.getNombre());
    System.out.println("Version: " + config1.getVersion());

    System.out.println("----------------------------------");

    LoggerSistema log1 = LoggerSistema.getInstance();
    LoggerSistema log2 = LoggerSistema.getInstance();

    log1.log("Inicializando sistema");
    log1.log("Cargando modulos");
    log1.log("Listo");

    System.out.println("Es el mismo objeto: " + (log1 == log2));

}