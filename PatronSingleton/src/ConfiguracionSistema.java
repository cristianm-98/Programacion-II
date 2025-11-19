public class ConfiguracionSistema {

    private static ConfiguracionSistema instance;
    private String nombre;
    private String version;

    private ConfiguracionSistema(){
        nombre="Mi App";
        version="1.0";
    }

    public static ConfiguracionSistema getInstance(){
        if(instance==null){
            instance = new ConfiguracionSistema();
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
