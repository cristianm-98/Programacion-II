import java.util.ArrayList;
import java.util.List;

public class Periodico implements FuenteNoticias {
    private List<Suscriptor> suscriptores = new ArrayList<>();

    @Override
    public void agregarSuscriptor(Suscriptor s) {
        suscriptores.add(s);

    }

    @Override
    public void eliminarSuscriptor(Suscriptor s) {
        suscriptores.remove(s);

    }

    @Override
    public void notificarSuscriptor(String noticia) {
        for(Suscriptor s : suscriptores){
            s.recibirNoticia(noticia);
        }
    }
    public void publicarNoticia(String noticia){
        System.out.println("Periodico publica: " + noticia);
        notificarSuscriptor(noticia);
    }
}