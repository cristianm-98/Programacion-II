void main() {

    Usuario usuario = new Usuario.Builder()
            .nombre("Ana")
            .apellido("Restrepo")
            .correo("ana@mail.com")
            .telefono("8577014")
            .direccion("Manzana 60")
            .build();

    System.out.println(usuario);

}
