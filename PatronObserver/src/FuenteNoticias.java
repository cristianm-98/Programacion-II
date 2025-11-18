interface FuenteNoticias {
    void agregarSuscriptor(Suscriptor s);
    void eliminarSuscriptor(Suscriptor s);
    void notificarSuscriptor(String noticia);

}
