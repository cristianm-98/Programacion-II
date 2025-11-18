public class Usuario implements Suscriptor{
    private String nombre;

    public Usuario(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void recibirNoticia(String noticia) {
        System.out.println(nombre + " recibe la noticia: " + noticia);

    }
}
