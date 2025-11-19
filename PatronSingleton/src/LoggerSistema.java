public class LoggerSistema {
    private static LoggerSistema instance;

    private LoggerSistema() {
        System.out.println("logger inicializando");
    }

    public static LoggerSistema getInstance() {
        if (instance == null) {
            instance = new LoggerSistema();
        }
        return instance;
    }

    public void log(String mensaje){
        System.out.println("log " + mensaje);
    }
}
