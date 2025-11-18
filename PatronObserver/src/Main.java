void main() {
    Periodico periodico = new Periodico();

    Usuario u1 = new Usuario("Cristian");
    Usuario u2 = new Usuario("Ana");

    periodico.agregarSuscriptor(u1);
    periodico.agregarSuscriptor(u2);

    periodico.publicarNoticia("Nueva ley de educación aprobada.");
    periodico.publicarNoticia("Se anuncia concierto en la ciudad.");

    periodico.eliminarSuscriptor(u1);
    periodico.publicarNoticia("Descuento en el transporte público.");
}
